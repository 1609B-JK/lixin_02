package com.jk.mapper.banner;

import com.jk.entity.banner.BannerResponse;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by nihao on 2017/5/25.
 */
public interface BannerMapper {

    @Select(" select t_id as \"bannerID\", t_title as \"bannerTitle\", t_ImgPath as \"bannerImgPath\",t_linkurl as \"bannerLinkUrl\" from t_banners ")
    List<BannerResponse> select_banner_list();

    @Select(" select t_id as \"bannerID\", t_title as \"bannerTitle\", t_content as \"bannerContent\", t_ImgPath as \"bannerImgPath\",t_linkurl as \"bannerLinkUrl\" from zongyi_banners ")
    List<BannerResponse> select_zybanner_list();

}
