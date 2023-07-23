package com.gy.gyuser.service.impl;

import org.springframework.stereotype.Service;
import com.gy.gyuser.model.GyUser;
import com.gy.gyuser.model.GyUserExample;
import java.lang.String;
import java.util.List;
import com.gy.gyuser.mapper.GyUserMapper;
import com.gy.gyuser.service.GyUserService;

@Service
public class GyUserServiceImpl implements GyUserService{

    private GyUserMapper mapper;

    // 通过构�?�器注入 mapper
    public GyUserServiceImpl(GyUserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(GyUserExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GyUserExample example) {
        return mapper.deleteByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public int deleteByPrimaryKey(String gyUserId) {
        return mapper.deleteByPrimaryKey(gyUserId);
    }

    @Override
    public int insert(GyUser record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(GyUser record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<GyUser> selectByExample(GyUserExample example) {
        return mapper.selectByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public GyUser selectByPrimaryKey(String gyUserId) {
        return mapper.selectByPrimaryKey(gyUserId);
    }

    @Override
    public int updateByExampleSelective(GyUser record,GyUserExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(GyUser record,GyUserExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(GyUser record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GyUser record) {
        return mapper.updateByPrimaryKey(record);
    }

}
