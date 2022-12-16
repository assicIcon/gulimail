package com.guli.order.mapper;

import com.guli.order.entity.OrderLogistics;
import com.guli.order.entity.OrderLogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderLogisticsMapper {
    long countByExample(OrderLogisticsExample example);

    int deleteByExample(OrderLogisticsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderLogistics record);

    int insertSelective(OrderLogistics record);

    List<OrderLogistics> selectByExample(OrderLogisticsExample example);

    OrderLogistics selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderLogistics record, @Param("example") OrderLogisticsExample example);

    int updateByExample(@Param("record") OrderLogistics record, @Param("example") OrderLogisticsExample example);

    int updateByPrimaryKeySelective(OrderLogistics record);

    int updateByPrimaryKey(OrderLogistics record);
}