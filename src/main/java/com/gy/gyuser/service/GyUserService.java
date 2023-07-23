package com.gy.gyuser.service;

import com.gy.gyuser.model.GyUser;
import com.gy.gyuser.model.GyUserExample;
import java.lang.String;
import java.util.List;


public interface GyUserService{
    // 根据条件汇�?�记录数
    long countByExample(GyUserExample example);
    // 根据条件删除
    int deleteByExample(GyUserExample example);
    // 根据主键删除，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型
    int deleteByPrimaryKey(String gyUserId);
    // 全字段插�?
    int insert(GyUser record);
    // 有�?�择的插�?
    int insertSelective(GyUser record);
    //根据条件查询
    List<GyUser> selectByExample(GyUserExample example);
    // 根据主键查询，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型 
    GyUser selectByPrimaryKey(String gyUserId);
    // 根据条件有�?�择的更�?
    int updateByExampleSelective(GyUser record,GyUserExample example);
    // 根据条件全字段更�?
    int updateByExample(GyUser record,GyUserExample example);
    // 根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(GyUser record);
    // 根据主键全字段的更新
    int updateByPrimaryKey(GyUser record);

}