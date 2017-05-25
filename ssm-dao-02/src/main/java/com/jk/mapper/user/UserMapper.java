package com.jk.mapper.user;

import com.jk.entity.user.User;
import com.jk.entity.user.UserRequest;
import com.jk.entity.user.UserResponse;

/**
 * Created by nihao on 2017/5/23.
 */
public interface UserMapper {

    UserResponse login(UserRequest userRequest);

    void insertUser(UserRequest userRequest);
}
