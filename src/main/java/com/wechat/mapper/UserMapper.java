package com.wechat.mapper;

import com.wechat.model.User;



/**
 * Created by User on 2018/5/22.
 */

public interface UserMapper {

    User selectUser(Integer id);
}