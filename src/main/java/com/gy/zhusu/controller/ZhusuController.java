package com.gy.zhusu.controller;

import com.gy.zhusu.model.Zhusu;
import com.gy.zhusu.model.ZhusuExample;
import com.gy.zhusu.service.ZhusuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 添加注解
@Controller
public class ZhusuController {

    private ZhusuService zhusuService;

    // 通过构�?�器注入服务
    public ZhusuController(ZhusuService zhusuService){
        this.zhusuService=zhusuService;
    }

    // 查询数据
    @GetMapping("/zhusu")
    @ResponseBody
    public List<Zhusu> selectZhusu(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        ZhusuExample example = new ZhusuExample();
        //1.2 创建条件构�?�器
        ZhusuExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<Zhusu> list = zhusuService.selectByExample(example);

        return list;
    }
    // 添加数据
    @PostMapping("/zhusu")
    @ResponseBody
    public Zhusu insertUser(@RequestBody Zhusu zhusu){
        // 准备数据
        // 比如：设置主�?

        zhusuService.insertSelective(zhusu);

        return zhusu;
    }
    // 修改数据
    @PutMapping("/zhusu")
    @ResponseBody
    public Zhusu updateUser(@RequestBody Zhusu zhusu){

        zhusuService.updateByPrimaryKeySelective(zhusu);
        // 只返回修改的字段数据
        return zhusu;
        // 或�?? 通过主键，从数据库查询完整的数据，然后返回�?�注意获得主键的方法是否正确
        //return zhusuService.selectByPrimaryKey(zhusu.getZhusuId());

    }
    // 删除数据
    @DeleteMapping("/zhusu/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") String zhusuId){

        // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
        zhusuService.deleteByPrimaryKey(zhusuId);

        // 返回状�?�码
        return "200";
    }
}
