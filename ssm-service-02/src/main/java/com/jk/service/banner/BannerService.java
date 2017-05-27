package com.jk.service.banner;

import com.jk.entity.banner.BannerResponse;

import java.util.List;

/**
 * Created by nihao on 2017/5/25.
 */
public interface BannerService {
    List<BannerResponse> select_banner_list();

    List<BannerResponse> select_zybanner_list();
}
