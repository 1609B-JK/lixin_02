package com.jk.service.zymovie.impl;

import com.jk.entity.banner.BannerResponse;
import com.jk.entity.movie.MovieResponse;
import com.jk.mapper.zymovie.MovieMapper;
import com.jk.service.zymovie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nihao on 2017/5/27.
 */
@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public List<MovieResponse> select_movie_list() {
        return movieMapper.select_movie_list();
    }
}
