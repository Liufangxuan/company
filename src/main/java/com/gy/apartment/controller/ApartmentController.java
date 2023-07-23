package com.gy.apartment.controller;

import com.gy.apartment.model.Apartment;
import com.gy.apartment.model.ApartmentExample;
import com.gy.apartment.service.ApartmentService;
import com.gy.util.IdUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 添加注解
@Controller
public class ApartmentController {

    private ApartmentService apartmentService;

    // 通过构�?�器注入服务
    public ApartmentController(ApartmentService apartmentService){
        this.apartmentService=apartmentService;
    }

    // 查询数据
    @GetMapping("/apartment")
    @ResponseBody
    public List<Apartment> selectApartment(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        ApartmentExample example = new ApartmentExample();
        //1.2 创建条件构�?�器
        ApartmentExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<Apartment> list = apartmentService.selectByExample(example);

        return list;
    }
    // 添加数据
    @PostMapping("/apartment")
    @ResponseBody
    public Apartment insertUser(@RequestBody Apartment apartment){
        // 准备数据
        // 比如：设置主�?
        apartment.setApartmentId(IdUtil.nextId9().toString());

        apartmentService.insertSelective(apartment);

        return apartment;
    }
    // 修改数据
    @PutMapping("/apartment")
    @ResponseBody
    public Apartment updateUser(@RequestBody Apartment apartment){

        apartmentService.updateByPrimaryKeySelective(apartment);
        // 只返回修改的字段数据
        return apartment;
        // 或�?? 通过主键，从数据库查询完整的数据，然后返回�?�注意获得主键的方法是否正确
        //return apartmentService.selectByPrimaryKey(apartment.getApartmentId());

    }
    // 删除数据
    @DeleteMapping("/apartment/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") String apartmentId){

        // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
        apartmentService.deleteByPrimaryKey(apartmentId);

        // 返回状�?�码
        return "200";
    }
}
