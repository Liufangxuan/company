package com.gy.suguan.controller;

import com.gy.suguan.model.Suguan;
import com.gy.suguan.model.SuguanExample;
import com.gy.suguan.service.SuguanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 添加注解
@Controller
public class SuguanController {

    private SuguanService suguanService;

    // 通过构�?�器注入服务
    public SuguanController(SuguanService suguanService){
        this.suguanService=suguanService;
    }

    // 查询数据
    @GetMapping("/suguan")
    @ResponseBody
    public List<Suguan> selectSuguan(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        SuguanExample example = new SuguanExample();
        //1.2 创建条件构�?�器
        SuguanExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<Suguan> list = suguanService.selectByExample(example);

        return list;
    }
    // 添加数据
    @PostMapping("/suguan")
    @ResponseBody
    public Suguan insertUser(@RequestBody Suguan suguan){
        // 准备数据
        // 比如：设置主�?

        suguanService.insertSelective(suguan);

        return suguan;
    }
    // 修改数据
    @PutMapping("/suguan")
    @ResponseBody
    public Suguan updateUser(@RequestBody Suguan suguan){

        suguanService.updateByPrimaryKeySelective(suguan);
        // 只返回修改的字段数据
        return suguan;
        // 或�?? 通过主键，从数据库查询完整的数据，然后返回�?�注意获得主键的方法是否正确
        //return suguanService.selectByPrimaryKey(suguan.getSuguanId());

    }
    // 删除数据
    @DeleteMapping("/suguan/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") String suguanId){

        // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
        suguanService.deleteByPrimaryKey(suguanId);

        // 返回状�?�码
        return "200";
    }
}
