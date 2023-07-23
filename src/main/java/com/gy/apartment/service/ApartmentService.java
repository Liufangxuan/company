package com.gy.apartment.service;

import com.gy.apartment.model.Apartment;
import com.gy.apartment.model.ApartmentExample;
import java.lang.String;
import java.util.List;


public interface ApartmentService{
    // 根据条件汇�?�记录数
    long countByExample(ApartmentExample example);
    // 根据条件删除
    int deleteByExample(ApartmentExample example);
    // 根据主键删除，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型
    int deleteByPrimaryKey(String apartmentId);
    // 全字段插�?
    int insert(Apartment record);
    // 有�?�择的插�?
    int insertSelective(Apartment record);
    //根据条件查询
    List<Apartment> selectByExample(ApartmentExample example);
    // 根据主键查询，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型 
    Apartment selectByPrimaryKey(String apartmentId);
    // 根据条件有�?�择的更�?
    int updateByExampleSelective(Apartment record,ApartmentExample example);
    // 根据条件全字段更�?
    int updateByExample(Apartment record,ApartmentExample example);
    // 根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(Apartment record);
    // 根据主键全字段的更新
    int updateByPrimaryKey(Apartment record);

}