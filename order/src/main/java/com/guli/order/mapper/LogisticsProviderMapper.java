package com.guli.order.mapper;

import com.guli.order.entity.LogisticsProvider;
import com.guli.order.entity.LogisticsProviderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsProviderMapper {
    long countByExample(LogisticsProviderExample example);

    int deleteByExample(LogisticsProviderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LogisticsProvider record);

    int insertSelective(LogisticsProvider record);

    List<LogisticsProvider> selectByExample(LogisticsProviderExample example);

    LogisticsProvider selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LogisticsProvider record, @Param("example") LogisticsProviderExample example);

    int updateByExample(@Param("record") LogisticsProvider record, @Param("example") LogisticsProviderExample example);

    int updateByPrimaryKeySelective(LogisticsProvider record);

    int updateByPrimaryKey(LogisticsProvider record);
}