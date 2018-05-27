package com.wechat.service.impl;

import com.wechat.mapper.UserMapper;
import com.wechat.model.User;
import com.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * Created by User on 2018/5/22.
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUser(Integer id) {
       return userMapper.selectUser(id);
    }
}

