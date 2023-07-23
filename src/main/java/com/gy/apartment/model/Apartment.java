package com.gy.apartment.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Apartment implements Serializable {
    private String apartmentId;

    private String suguanId;

    private String apartmentNum;

    private String apartmentName;

    private static final long serialVersionUID = 1L;

    public String getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(String apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getSuguanId() {
        return suguanId;
    }

    public void setSuguanId(String suguanId) {
        this.suguanId = suguanId;
    }

    public String getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(String apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }
}