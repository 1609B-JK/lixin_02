package com.jk.service.type;

import com.jk.entity.type.MovieTypeResponse;

import java.util.List;

/**
 * Created by nihao on 2017/5/25.
 */
public interface TypeService {
    List<MovieTypeResponse> select_movie_type_list();
}
