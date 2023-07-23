package com.gy.suguan.service;

import com.gy.suguan.model.Suguan;
import com.gy.suguan.model.SuguanExample;
import java.lang.String;
import java.util.List;


public interface SuguanService{
    // 根据条件汇�?�记录数
    long countByExample(SuguanExample example);
    // 根据条件删除
    int deleteByExample(SuguanExample example);
    // 根据主键删除，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型
    int deleteByPrimaryKey(String suguanId);
    // 全字段插�?
    int insert(Suguan record);
    // 有�?�择的插�?
    int insertSelective(Suguan record);
    //根据条件查询
    List<Suguan> selectByExample(SuguanExample example);
    // 根据主键查询，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型 
    Suguan selectByPrimaryKey(String suguanId);
    // 根据条件有�?�择的更�?
    int updateByExampleSelective(Suguan record,SuguanExample example);
    // 根据条件全字段更�?
    int updateByExample(Suguan record,SuguanExample example);
    // 根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(Suguan record);
    // 根据主键全字段的更新
    int updateByPrimaryKey(Suguan record);

}