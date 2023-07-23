package com.gy.gyuser.mapper;

import com.gy.gyuser.model.GyUser;
import com.gy.gyuser.model.GyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GyUserMapper {
    long countByExample(GyUserExample example);

    int deleteByExample(GyUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(GyUser record);

    int insertSelective(GyUser record);

    List<GyUser> selectByExample(GyUserExample example);

    GyUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") GyUser record, @Param("example") GyUserExample example);

    int updateByExample(@Param("record") GyUser record, @Param("example") GyUserExample example);

    int updateByPrimaryKeySelective(GyUser record);

    int updateByPrimaryKey(GyUser record);
}