package com.demo.dao;

import com.demo.po.HealthTask;

public interface HealthTaskMapper {
    int insert(HealthTask record);

    int insertSelective(HealthTask record);
}