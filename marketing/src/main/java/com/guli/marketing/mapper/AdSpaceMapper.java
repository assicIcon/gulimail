package com.guli.marketing.mapper;

import com.guli.marketing.entity.AdSpace;
import com.guli.marketing.entity.AdSpaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdSpaceMapper {
    long countByExample(AdSpaceExample example);

    int deleteByExample(AdSpaceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdSpace record);

    int insertSelective(AdSpace record);

    List<AdSpace> selectByExample(AdSpaceExample example);

    AdSpace selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdSpace record, @Param("example") AdSpaceExample example);

    int updateByExample(@Param("record") AdSpace record, @Param("example") AdSpaceExample example);

    int updateByPrimaryKeySelective(AdSpace record);

    int updateByPrimaryKey(AdSpace record);
}