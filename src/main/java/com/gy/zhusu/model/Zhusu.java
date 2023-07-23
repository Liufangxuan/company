package com.gy.zhusu.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Zhusu implements Serializable {
    private String zhusuId;

    private String roomId;

    private String type;

    private String userId;

    private String roomNum;

    private static final long serialVersionUID = 1L;

    public String getZhusuId() {
        return zhusuId;
    }

    public void setZhusuId(String zhusuId) {
        this.zhusuId = zhusuId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }
}