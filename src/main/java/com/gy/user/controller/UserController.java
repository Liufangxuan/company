package com.gy.user.controller;

import com.gy.user.model.User;
import com.gy.user.model.UserExample;
import com.gy.user.service.UserService;
import com.gy.util.IdUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

// 添加注解
@Controller
public class UserController {

    private UserService userService;

    // 通过构�?�器注入服务
    public UserController(UserService userService){
        this.userService=userService;
    }

    // 查询数据
    @GetMapping("/user")
    @ResponseBody
    public List<User> selectUser(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        UserExample example = new UserExample();
        //1.2 创建条件构�?�器
        UserExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<User> list = userService.selectByExample(example);

        return list;
    }
    // 添加数据
    @PostMapping("/user")
    @ResponseBody
    public User insertUser(@RequestBody User user){
        // 准备数据
        // 比如：设置主�?
        user.setUserId(IdUtil.nextId9().toString());
        user.setCurrentStatus("0");//0-正常状态;1-禁用状态
        user.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        user.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));

        userService.insertSelective(user);

        return user;
    }
    // 修改数据
    @PutMapping("/user")
    @ResponseBody
    public User updateUser(@RequestBody User user){

        //userService.updateByPrimaryKeySelective(user);
        // 只返回修改的字段数据
        //return user;
        // 或�?? 通过主键，从数据库查询完整的数据，然后返回�?�注意获得主键的方法是否正确
        //return userService.selectByPrimaryKey(user.getUserId());
        if(user.getCurrentPassword() == ""){
            user.setCurrentPassword(null);
        }
        userService.updateByPrimaryKeySelective(user);
//query by primary-key and return
        return userService.selectByPrimaryKey(user.getUserId());

    }
    // 删除数据
    @DeleteMapping("/user/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") String userId){

        // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
        userService.deleteByPrimaryKey(userId);

        // 返回状�?�码
        return "200";
    }
}
