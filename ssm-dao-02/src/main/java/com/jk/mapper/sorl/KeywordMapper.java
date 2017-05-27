package com.jk.mapper.sorl;

import com.jk.entity.sorl.Keyword;

import java.util.List;

/**
 * Created by nihao on 2017/5/27.
 */
public interface KeywordMapper {
    List<Keyword> searchKeyword_List(Keyword keyword);
}
