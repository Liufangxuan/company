package com.gy.goods.service.impl;

import org.springframework.stereotype.Service;
import com.gy.goods.model.Goods;
import com.gy.goods.model.GoodsExample;
import java.lang.String;
import java.util.List;
import com.gy.goods.mapper.GoodsMapper;
import com.gy.goods.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

    private GoodsMapper mapper;

    // 通过构�?�器注入 mapper
    public GoodsServiceImpl(GoodsMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(GoodsExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GoodsExample example) {
        return mapper.deleteByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public int deleteByPrimaryKey(String goodsId) {
        return mapper.deleteByPrimaryKey(goodsId);
    }

    @Override
    public int insert(Goods record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Goods record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Goods> selectByExample(GoodsExample example) {
        return mapper.selectByExample(example);
    }

    // 要根据数据表主键的类型修改参数类型，�?般位整型或长整型或字符串类型
    @Override
    public Goods selectByPrimaryKey(String goodsId) {
        return mapper.selectByPrimaryKey(goodsId);
    }

    @Override
    public int updateByExampleSelective(Goods record,GoodsExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Goods record,GoodsExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return mapper.updateByPrimaryKey(record);
    }

}
