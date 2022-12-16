package com.guli.order.mapper;

import com.guli.order.entity.LogisticsProviderContact;
import com.guli.order.entity.LogisticsProviderContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsProviderContactMapper {
    long countByExample(LogisticsProviderContactExample example);

    int deleteByExample(LogisticsProviderContactExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LogisticsProviderContact record);

    int insertSelective(LogisticsProviderContact record);

    List<LogisticsProviderContact> selectByExample(LogisticsProviderContactExample example);

    LogisticsProviderContact selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LogisticsProviderContact record, @Param("example") LogisticsProviderContactExample example);

    int updateByExample(@Param("record") LogisticsProviderContact record, @Param("example") LogisticsProviderContactExample example);

    int updateByPrimaryKeySelective(LogisticsProviderContact record);

    int updateByPrimaryKey(LogisticsProviderContact record);
}