package com.jk.mapper.zymovie;

import com.jk.entity.banner.BannerResponse;
import com.jk.entity.movie.MovieResponse;

import java.util.List;

/**
 * Created by nihao on 2017/5/27.
 */
public interface MovieMapper {
    List<MovieResponse> select_movie_list();
}
