package com.gy.suguan.mapper;

import com.gy.suguan.model.Suguan;
import com.gy.suguan.model.SuguanExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SuguanMapper {
    long countByExample(SuguanExample example);

    int deleteByExample(SuguanExample example);

    int deleteByPrimaryKey(String suguanId);

    int insert(Suguan record);

    int insertSelective(Suguan record);

    List<Suguan> selectByExample(SuguanExample example);

    Suguan selectByPrimaryKey(String suguanId);

    int updateByExampleSelective(@Param("record") Suguan record, @Param("example") SuguanExample example);

    int updateByExample(@Param("record") Suguan record, @Param("example") SuguanExample example);

    int updateByPrimaryKeySelective(Suguan record);

    int updateByPrimaryKey(Suguan record);
}