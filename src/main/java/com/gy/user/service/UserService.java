package com.gy.user.service;

import com.gy.user.model.User;
import com.gy.user.model.UserExample;
import java.lang.String;
import java.util.List;


public interface UserService{
    // 根据条件汇�?�记录数
    long countByExample(UserExample example);
    // 根据条件删除
    int deleteByExample(UserExample example);
    // 根据主键删除，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型
    int deleteByPrimaryKey(String userId);
    // 全字段插�?
    int insert(User record);
    // 有�?�择的插�?
    int insertSelective(User record);
    //根据条件查询
    List<User> selectByExample(UserExample example);
    // 根据主键查询，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型 
    User selectByPrimaryKey(String userId);
    // 根据条件有�?�择的更�?
    int updateByExampleSelective(User record,UserExample example);
    // 根据条件全字段更�?
    int updateByExample(User record,UserExample example);
    // 根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(User record);
    // 根据主键全字段的更新
    int updateByPrimaryKey(User record);

}