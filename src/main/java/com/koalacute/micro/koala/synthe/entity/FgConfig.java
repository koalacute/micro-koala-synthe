package com.koalacute.micro.koala.synthe.entity;

import java.util.Date;

public class FgConfig {
    private Long id;

    private Date createdTime;

    private Date updatedTime;

    private String ntHour;

    private String ntWeek;

    private String ntTitle;

    private String ntContent;

    private String validFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getNtHour() {
        return ntHour;
    }

    public void setNtHour(String ntHour) {
        this.ntHour = ntHour == null ? null : ntHour.trim();
    }

    public String getNtWeek() {
        return ntWeek;
    }

    public void setNtWeek(String ntWeek) {
        this.ntWeek = ntWeek == null ? null : ntWeek.trim();
    }

    public String getNtTitle() {
        return ntTitle;
    }

    public void setNtTitle(String ntTitle) {
        this.ntTitle = ntTitle == null ? null : ntTitle.trim();
    }

    public String getNtContent() {
        return ntContent;
    }

    public void setNtContent(String ntContent) {
        this.ntContent = ntContent == null ? null : ntContent.trim();
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag == null ? null : validFlag.trim();
    }
}