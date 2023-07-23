package com.gy.gyuser.controller;

import com.gy.gyuser.model.GyUser;
import com.gy.gyuser.model.GyUserExample;
import com.gy.gyuser.service.GyUserService;
import com.gy.util.IdUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 添加注解
@Controller
public class GyUserController {

    private GyUserService gyUserService;

    // 通过构�?�器注入服务
    public GyUserController(GyUserService gyUserService){
        this.gyUserService=gyUserService;
    }

    // 查询数据
    @GetMapping("/gyUser")
    @ResponseBody
    public List<GyUser> selectGyUser(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        GyUserExample example = new GyUserExample();
        //1.2 创建条件构�?�器
        GyUserExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<GyUser> list = gyUserService.selectByExample(example);

        return list;
    }
    // 添加数据
    @PostMapping("/gyUser")
    @ResponseBody
    public GyUser insertUser(@RequestBody GyUser gyUser){
        // 准备数据
        // 比如：设置主�?
        gyUser.setUserId(IdUtil.nextId9().toString());

        gyUserService.insertSelective(gyUser);

        return gyUser;
    }
    // 修改数据
    @PutMapping("/gyUser")
    @ResponseBody
    public GyUser updateUser(@RequestBody GyUser gyUser){

        gyUserService.updateByPrimaryKeySelective(gyUser);
        // 只返回修改的字段数据
        return gyUser;
        // 或�?? 通过主键，从数据库查询完整的数据，然后返回�?�注意获得主键的方法是否正确
        //return gyUserService.selectByPrimaryKey(gyUser.getGyUserId());

    }
    // 删除数据
    @DeleteMapping("/gyUser/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") String gyUserId){

        // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
        gyUserService.deleteByPrimaryKey(gyUserId);

        // 返回状�?�码
        return "200";
    }
}
