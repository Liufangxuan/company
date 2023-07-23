package com.gy.apartment.mapper;

import com.gy.apartment.model.Apartment;
import com.gy.apartment.model.ApartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ApartmentMapper {
    long countByExample(ApartmentExample example);

    int deleteByExample(ApartmentExample example);

    int deleteByPrimaryKey(String apartmentId);

    int insert(Apartment record);

    int insertSelective(Apartment record);

    List<Apartment> selectByExample(ApartmentExample example);

    Apartment selectByPrimaryKey(String apartmentId);

    int updateByExampleSelective(@Param("record") Apartment record, @Param("example") ApartmentExample example);

    int updateByExample(@Param("record") Apartment record, @Param("example") ApartmentExample example);

    int updateByPrimaryKeySelective(Apartment record);

    int updateByPrimaryKey(Apartment record);
}