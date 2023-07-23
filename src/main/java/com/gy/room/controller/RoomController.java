package com.gy.room.controller;

import com.gy.room.model.Room;
import com.gy.room.model.RoomExample;
import com.gy.room.service.RoomService;
import com.gy.util.IdUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 添加注解
@Controller
public class RoomController {

    private RoomService roomService;

    // 通过构�?�器注入服务
    public RoomController(RoomService roomService){
        this.roomService=roomService;
    }

    // 查询数据
    @GetMapping("/room")
    @ResponseBody
    public List<Room> selectRoom(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        RoomExample example = new RoomExample();
        //1.2 创建条件构�?�器
        RoomExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<Room> list = roomService.selectByExample(example);

        return list;
    }
    // 添加数据
    @PostMapping("/room")
    @ResponseBody
    public Room insertUser(@RequestBody Room room){
        // 准备数据
        // 比如：设置主�?
        room.setRoomId(IdUtil.nextId9().toString());

        roomService.insertSelective(room);

        return room;
    }
    // 修改数据
    @PutMapping("/room")
    @ResponseBody
    public Room updateUser(@RequestBody Room room){

        roomService.updateByPrimaryKeySelective(room);
        // 只返回修改的字段数据
        return room;
        // 或�?? 通过主键，从数据库查询完整的数据，然后返回�?�注意获得主键的方法是否正确
        //return roomService.selectByPrimaryKey(room.getRoomId());

    }
    // 删除数据
    @DeleteMapping("/room/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") String roomId){

        // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
        roomService.deleteByPrimaryKey(roomId);

        // 返回状�?�码
        return "200";
    }
}
