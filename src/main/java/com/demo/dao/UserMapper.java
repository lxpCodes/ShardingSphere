package com.demo.dao;

import com.demo.po.User;
import com.demo.po.UserExample;

public interface UserMapper {
    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);
}