package com.gy.zhusu.service.impl;

import org.springframework.stereotype.Service;
import com.gy.zhusu.model.Zhusu;
import com.gy.zhusu.model.ZhusuExample;
import java.lang.String;
import java.util.List;
import com.gy.zhusu.mapper.ZhusuMapper;
import com.gy.zhusu.service.ZhusuService;

@Service
public class ZhusuServiceImpl implements ZhusuService{

    private ZhusuMapper mapper;

    // 通过构�?�器注入 mapper
    public ZhusuServiceImpl(ZhusuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(ZhusuExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ZhusuExample example) {
        return mapper.deleteByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public int deleteByPrimaryKey(String zhusuId) {
        return mapper.deleteByPrimaryKey(zhusuId);
    }

    @Override
    public int insert(Zhusu record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Zhusu record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Zhusu> selectByExample(ZhusuExample example) {
        return mapper.selectByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public Zhusu selectByPrimaryKey(String zhusuId) {
        return mapper.selectByPrimaryKey(zhusuId);
    }

    @Override
    public int updateByExampleSelective(Zhusu record,ZhusuExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Zhusu record,ZhusuExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Zhusu record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Zhusu record) {
        return mapper.updateByPrimaryKey(record);
    }

}
