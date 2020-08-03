package com.demo.dao;

import com.demo.po.HealthRecord;

public interface HealthRecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(HealthRecord record);

    int insertSelective(HealthRecord record);

    HealthRecord selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(HealthRecord record);

    int updateByPrimaryKey(HealthRecord record);
}