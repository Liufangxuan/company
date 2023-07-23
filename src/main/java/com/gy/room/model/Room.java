package com.gy.room.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Room implements Serializable {
    private String roomId;

    private String apartmentId;

    private String apartmentNum;

    private String roomNum;

    private static final long serialVersionUID = 1L;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(String apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(String apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }
}