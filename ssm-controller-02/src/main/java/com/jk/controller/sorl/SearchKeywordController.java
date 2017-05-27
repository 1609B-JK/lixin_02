package com.jk.controller.sorl;

import com.jk.entity.ResultData;
import com.jk.entity.sorl.Keyword;
import com.jk.service.sorl.KeywordService;
import common.util.PinYinUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by nihao on 2017/5/27.
 */
@Controller
@RequestMapping("word")
public class SearchKeywordController {

    @Autowired
    private KeywordService keywordService;

    @RequestMapping("spell_check")
    @ResponseBody
    public ResultData searchKeyword_List(@RequestBody Keyword keyword){
        String msg = "对不起没有您要查找的信息";
        int code = 200;
        Object data = null;
        ResultData rd = new ResultData();
        String newKeyword = PinYinUtil.getPinYinHeadChar(keyword.getKeyWord());
        keyword.setPinYin(newKeyword);
        List<Keyword> wordList = keywordService.searchKeyword_List(keyword);
        if(0 < wordList.size()){
            msg = "成功";
            rd.setCode(code);
            rd.setMsg(msg);
            rd.setData(wordList);
        }
        rd.setCode(code);
        rd.setMsg(msg);
        return rd;
    }
}
