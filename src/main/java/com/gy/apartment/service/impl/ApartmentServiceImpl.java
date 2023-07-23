package com.gy.apartment.service.impl;

import org.springframework.stereotype.Service;
import com.gy.apartment.model.Apartment;
import com.gy.apartment.model.ApartmentExample;
import java.lang.String;
import java.util.List;
import com.gy.apartment.mapper.ApartmentMapper;
import com.gy.apartment.service.ApartmentService;

@Service
public class ApartmentServiceImpl implements ApartmentService{

    private ApartmentMapper mapper;

    // 通过构�?�器注入 mapper
    public ApartmentServiceImpl(ApartmentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(ApartmentExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ApartmentExample example) {
        return mapper.deleteByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public int deleteByPrimaryKey(String apartmentId) {
        return mapper.deleteByPrimaryKey(apartmentId);
    }

    @Override
    public int insert(Apartment record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Apartment record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Apartment> selectByExample(ApartmentExample example) {
        return mapper.selectByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public Apartment selectByPrimaryKey(String apartmentId) {
        return mapper.selectByPrimaryKey(apartmentId);
    }

    @Override
    public int updateByExampleSelective(Apartment record,ApartmentExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Apartment record,ApartmentExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Apartment record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Apartment record) {
        return mapper.updateByPrimaryKey(record);
    }

}
