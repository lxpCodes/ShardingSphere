package com.demo.service.impl;

import com.demo.dao.HealthRecordMapper;
import com.demo.dao.HealthTaskMapper;
import com.demo.po.HealthRecord;
import com.demo.po.HealthTask;
import com.demo.service.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HealthRecordServiceImpl
 * @Description TODO
 * @Author liangxp
 * @Date 2020/7/17 16:27
 **/
@Service
public class HealthRecordServiceImpl implements HealthRecordService {

    @Autowired
    private HealthRecordMapper healthRecordMapper;

    @Autowired
    private HealthTaskMapper healthTaskMapper;


    @Override
    public void processHealthRecords() throws SQLException {
        insertHealthRecords();
    }

    private List<Long> insertHealthRecords() throws SQLException {
        List<Long> result = new ArrayList<>(10);
        for (int i = 1; i < 11; i++) {
            HealthRecord healthRecord = insertHealthRecord(i);
            insertHealthTask(i, healthRecord);
            result.add(healthRecord.getRecordId());
        }
        return result;
    }


    private void insertHealthTask(int i, HealthRecord healthRecord) {
        HealthTask healthTask = new HealthTask();
        healthTask.setRecordId(healthRecord.getRecordId());
        healthTask.setUserId(i);
        healthTask.setTaskName("TaskName" + i);
        healthTaskMapper.insert(healthTask);
    }

    private HealthRecord insertHealthRecord(int i) {
        HealthRecord healthRecord = new HealthRecord();
        healthRecord.setUserId(i);
        healthRecord.setLevelId(i % 5);
        healthRecord.setRemark("Remark" + i);
        healthRecordMapper.insert(healthRecord);
        return healthRecord;
    }
}
