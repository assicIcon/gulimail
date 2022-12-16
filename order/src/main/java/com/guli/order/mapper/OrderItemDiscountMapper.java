package com.guli.order.mapper;

import com.guli.order.entity.OrderItemDiscount;
import com.guli.order.entity.OrderItemDiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemDiscountMapper {
    long countByExample(OrderItemDiscountExample example);

    int deleteByExample(OrderItemDiscountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderItemDiscount record);

    int insertSelective(OrderItemDiscount record);

    List<OrderItemDiscount> selectByExample(OrderItemDiscountExample example);

    OrderItemDiscount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderItemDiscount record, @Param("example") OrderItemDiscountExample example);

    int updateByExample(@Param("record") OrderItemDiscount record, @Param("example") OrderItemDiscountExample example);

    int updateByPrimaryKeySelective(OrderItemDiscount record);

    int updateByPrimaryKey(OrderItemDiscount record);
}