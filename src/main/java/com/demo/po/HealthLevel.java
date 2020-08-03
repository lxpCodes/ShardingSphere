package com.demo.po;

import java.io.Serializable;

public class HealthLevel implements Serializable {
    private Integer levelId;

    private String levelName;

    private static final long serialVersionUID = 1L;

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }
}