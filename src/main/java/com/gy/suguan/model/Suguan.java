package com.gy.suguan.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Suguan implements Serializable {
    private String suguanId;

    private String suguanName;

    private String suguanMobile;

    private static final long serialVersionUID = 1L;

    public String getSuguanId() {
        return suguanId;
    }

    public void setSuguanId(String suguanId) {
        this.suguanId = suguanId;
    }

    public String getSuguanName() {
        return suguanName;
    }

    public void setSuguanName(String suguanName) {
        this.suguanName = suguanName;
    }

    public String getSuguanMobile() {
        return suguanMobile;
    }

    public void setSuguanMobile(String suguanMobile) {
        this.suguanMobile = suguanMobile;
    }
}