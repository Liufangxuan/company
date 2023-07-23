package com.gy.suguan.service.impl;

import org.springframework.stereotype.Service;
import com.gy.suguan.model.Suguan;
import com.gy.suguan.model.SuguanExample;
import java.lang.String;
import java.util.List;
import com.gy.suguan.mapper.SuguanMapper;
import com.gy.suguan.service.SuguanService;

@Service
public class SuguanServiceImpl implements SuguanService{

    private SuguanMapper mapper;

    // 通过构�?�器注入 mapper
    public SuguanServiceImpl(SuguanMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(SuguanExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SuguanExample example) {
        return mapper.deleteByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public int deleteByPrimaryKey(String suguanId) {
        return mapper.deleteByPrimaryKey(suguanId);
    }

    @Override
    public int insert(Suguan record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Suguan record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Suguan> selectByExample(SuguanExample example) {
        return mapper.selectByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public Suguan selectByPrimaryKey(String suguanId) {
        return mapper.selectByPrimaryKey(suguanId);
    }

    @Override
    public int updateByExampleSelective(Suguan record,SuguanExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Suguan record,SuguanExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Suguan record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Suguan record) {
        return mapper.updateByPrimaryKey(record);
    }

}
