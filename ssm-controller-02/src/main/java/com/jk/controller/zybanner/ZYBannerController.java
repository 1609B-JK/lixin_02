package com.jk.controller.zybanner;

import com.jk.entity.ResultData;
import com.jk.entity.banner.BannerResponse;
import com.jk.service.banner.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by nihao on 2017/5/25.
 */
@Controller
@RequestMapping("/zongyi/")
public class ZYBannerController {

    @Autowired
    private BannerService bannerService;

    @RequestMapping("select_banner_list")
    @ResponseBody
    public ResultData select_banner_list() {
        String msg = "成功";
        int code = 200;
        ResultData rd = new ResultData();
        List<BannerResponse> listBanner = bannerService.select_zybanner_list();
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(listBanner);
        return rd;
    }
}
