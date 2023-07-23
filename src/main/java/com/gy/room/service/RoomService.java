package com.gy.room.service;

import com.gy.room.model.Room;
import com.gy.room.model.RoomExample;
import java.lang.String;
import java.util.List;


public interface RoomService{
    // 根据条件汇�?�记录数
    long countByExample(RoomExample example);
    // 根据条件删除
    int deleteByExample(RoomExample example);
    // 根据主键删除，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型
    int deleteByPrimaryKey(String roomId);
    // 全字段插�?
    int insert(Room record);
    // 有�?�择的插�?
    int insertSelective(Room record);
    //根据条件查询
    List<Room> selectByExample(RoomExample example);
    // 根据主键查询，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型 
    Room selectByPrimaryKey(String roomId);
    // 根据条件有�?�择的更�?
    int updateByExampleSelective(Room record,RoomExample example);
    // 根据条件全字段更�?
    int updateByExample(Room record,RoomExample example);
    // 根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(Room record);
    // 根据主键全字段的更新
    int updateByPrimaryKey(Room record);

}