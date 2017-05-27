package com.jk.service.sorl.impl;

import com.jk.entity.sorl.Keyword;
import com.jk.mapper.sorl.KeywordMapper;
import com.jk.service.sorl.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nihao on 2017/5/27.
 */
@Service
public class KeywordServiceImpl implements KeywordService{

    @Autowired
    private KeywordMapper keywordMapper;

    @Override
    public List<Keyword> searchKeyword_List(Keyword keyword) {
        System.out.println(keyword);
        return keywordMapper.searchKeyword_List(keyword);
    }
}
