package com.gy.zhusu.mapper;

import com.gy.zhusu.model.Zhusu;
import com.gy.zhusu.model.ZhusuExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ZhusuMapper {
    long countByExample(ZhusuExample example);

    int deleteByExample(ZhusuExample example);

    int deleteByPrimaryKey(String zhusuId);

    int insert(Zhusu record);

    int insertSelective(Zhusu record);

    List<Zhusu> selectByExample(ZhusuExample example);

    Zhusu selectByPrimaryKey(String zhusuId);

    int updateByExampleSelective(@Param("record") Zhusu record, @Param("example") ZhusuExample example);

    int updateByExample(@Param("record") Zhusu record, @Param("example") ZhusuExample example);

    int updateByPrimaryKeySelective(Zhusu record);

    int updateByPrimaryKey(Zhusu record);
}