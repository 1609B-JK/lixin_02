package com.jk.service.zymovie;

import com.jk.entity.banner.BannerResponse;
import com.jk.entity.movie.MovieResponse;

import java.util.List;

/**
 * Created by nihao on 2017/5/27.
 */
public interface MovieService {
    List<MovieResponse> select_movie_list();
}
