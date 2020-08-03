package com.demo.dao;

import com.demo.po.HealthLevel;

public interface HealthLevelMapper {
    int insert(HealthLevel record);

    int insertSelective(HealthLevel record);
}