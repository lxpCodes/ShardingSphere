package com.demo.service.impl;

import com.demo.dao.HealthLevelMapper;
import com.demo.po.HealthLevel;
import com.demo.service.HealthLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName HealthLevelServiceImpl
 * @Description TODO
 * @Author liangxp
 * @Date 2020/7/17 16:27
 **/
@Service
public class HealthLevelServiceImpl implements HealthLevelService {

    @Autowired
    private HealthLevelMapper healthLevelMapper;

    @Override
    public void addLevel() {
        for (int i = 0; i < 5; i++) {
            HealthLevel healthLevel = new HealthLevel();
            healthLevel.setLevelId(i);
            healthLevel.setLevelName("健康级别"+ i);
            healthLevelMapper.insert(healthLevel);
        }
    }
}
