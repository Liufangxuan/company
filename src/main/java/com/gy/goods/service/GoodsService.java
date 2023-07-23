package com.gy.goods.service;

import com.gy.goods.model.Goods;
import com.gy.goods.model.GoodsExample;
import java.lang.String;
import java.util.List;


public interface GoodsService{
    // 根据条件汇�?�记录数
    long countByExample(GoodsExample example);
    // 根据条件删除
    int deleteByExample(GoodsExample example);
    // 根据主键删除，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型
    int deleteByPrimaryKey(String goodsId);
    // 全字段插�?
    int insert(Goods record);
    // 有�?�择的插�?
    int insertSelective(Goods record);
    //根据条件查询
    List<Goods> selectByExample(GoodsExample example);
    // 根据主键查询，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型 
    Goods selectByPrimaryKey(String goodsId);
    // 根据条件有�?�择的更�?
    int updateByExampleSelective(Goods record,GoodsExample example);
    // 根据条件全字段更�?
    int updateByExample(Goods record,GoodsExample example);
    // 根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(Goods record);
    // 根据主键全字段的更新
    int updateByPrimaryKey(Goods record);

}