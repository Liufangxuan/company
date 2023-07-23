package com.gy.goods.controller;

import com.gy.goods.model.Goods;
import com.gy.goods.model.GoodsExample;
import com.gy.goods.service.GoodsService;
import com.gy.util.IdUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 添加注解
@Controller
public class GoodsController {

    private GoodsService goodsService;

    // 通过构�?�器注入服务
    public GoodsController(GoodsService goodsService){
        this.goodsService=goodsService;
    }

    // 查询数据
    @GetMapping("/goods")
    @ResponseBody
    public List<Goods> selectGoods(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        GoodsExample example = new GoodsExample();
        //1.2 创建条件构�?�器
        GoodsExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<Goods> list = goodsService.selectByExample(example);

        return list;
    }
    // 添加数据
    @PostMapping("/goods")
    @ResponseBody
    public Goods insertUser(@RequestBody Goods goods){
        // 准备数据
        // 比如：设置主�?
        goods.setGoodsId(IdUtil.nextId9().toString());

        goodsService.insertSelective(goods);

        return goods;
    }
    // 修改数据
    @PutMapping("/goods")
    @ResponseBody
    public Goods updateUser(@RequestBody Goods goods){

        goodsService.updateByPrimaryKeySelective(goods);
        // 只返回修改的字段数据
        return goods;
        // 或�?? 通过主键，从数据库查询完整的数据，然后返回�?�注意获得主键的方法是否正确
        //return goodsService.selectByPrimaryKey(goods.getGoodsId());

    }
    // 删除数据
    @DeleteMapping("/goods/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") String goodsId){

        // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
        goodsService.deleteByPrimaryKey(goodsId);

        // 返回状�?�码
        return "200";
    }
}
