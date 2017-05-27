package com.jk.controller.zymovie;

import com.jk.entity.ResultData;
import com.jk.entity.movie.MovieResponse;
import com.jk.service.zymovie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by nihao on 2017/5/27.
 */
@Controller
@RequestMapping("zongyi")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("select_movie_list")
    @ResponseBody
    public ResultData select_movie_list() {
        String msg = "成功";
        int code = 200;
        ResultData rd = new ResultData();
        List<MovieResponse> listMoie = movieService.select_movie_list();
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(listMoie);
        return rd;
    }

}
