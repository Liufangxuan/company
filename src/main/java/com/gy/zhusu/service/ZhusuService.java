package com.gy.zhusu.service;

import com.gy.zhusu.model.Zhusu;
import com.gy.zhusu.model.ZhusuExample;
import java.lang.String;
import java.util.List;


public interface ZhusuService{
    // 根据条件汇�?�记录数
    long countByExample(ZhusuExample example);
    // 根据条件删除
    int deleteByExample(ZhusuExample example);
    // 根据主键删除，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型
    int deleteByPrimaryKey(String zhusuId);
    // 全字段插�?
    int insert(Zhusu record);
    // 有�?�择的插�?
    int insertSelective(Zhusu record);
    //根据条件查询
    List<Zhusu> selectByExample(ZhusuExample example);
    // 根据主键查询，要根据数据表主键的类型修改参数类型，一般位整型或长整型或字符串类型 
    Zhusu selectByPrimaryKey(String zhusuId);
    // 根据条件有�?�择的更�?
    int updateByExampleSelective(Zhusu record,ZhusuExample example);
    // 根据条件全字段更�?
    int updateByExample(Zhusu record,ZhusuExample example);
    // 根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(Zhusu record);
    // 根据主键全字段的更新
    int updateByPrimaryKey(Zhusu record);

}