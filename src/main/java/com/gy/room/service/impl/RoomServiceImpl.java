package com.gy.room.service.impl;

import org.springframework.stereotype.Service;
import com.gy.room.model.Room;
import com.gy.room.model.RoomExample;
import java.lang.String;
import java.util.List;
import com.gy.room.mapper.RoomMapper;
import com.gy.room.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{

    private RoomMapper mapper;

    // 通过构�?�器注入 mapper
    public RoomServiceImpl(RoomMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(RoomExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RoomExample example) {
        return mapper.deleteByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public int deleteByPrimaryKey(String roomId) {
        return mapper.deleteByPrimaryKey(roomId);
    }

    @Override
    public int insert(Room record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Room record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Room> selectByExample(RoomExample example) {
        return mapper.selectByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public Room selectByPrimaryKey(String roomId) {
        return mapper.selectByPrimaryKey(roomId);
    }

    @Override
    public int updateByExampleSelective(Room record,RoomExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Room record,RoomExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Room record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Room record) {
        return mapper.updateByPrimaryKey(record);
    }

}
