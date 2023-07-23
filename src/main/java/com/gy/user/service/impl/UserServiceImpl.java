package com.gy.user.service.impl;

import org.springframework.stereotype.Service;
import com.gy.user.model.User;
import com.gy.user.model.UserExample;
import java.lang.String;
import java.util.List;
import com.gy.user.mapper.UserMapper;
import com.gy.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private UserMapper mapper;

    // 通过构�?�器注入 mapper
    public UserServiceImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(UserExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return mapper.deleteByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public int deleteByPrimaryKey(String userId) {
        return mapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return mapper.selectByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public User selectByPrimaryKey(String userId) {
        return mapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByExampleSelective(User record,UserExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(User record,UserExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return mapper.updateByPrimaryKey(record);
    }

}
