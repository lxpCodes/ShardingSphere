package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.po.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author liangxp
 * @Date 2020/7/17 16:26
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public void addNewUser() {
        for (int i = 1; i < 11; i++) {
            User user = new User();
            user.setUserId(i);
            user.setUserName("SD用户" + i);
            userMapper.insert(user);
        }
    }
}
