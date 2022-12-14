package com.guli.marketing.mapper;

import com.guli.marketing.entity.CouponUseCondition;
import com.guli.marketing.entity.CouponUseConditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponUseConditionMapper {
    long countByExample(CouponUseConditionExample example);

    int deleteByExample(CouponUseConditionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CouponUseCondition record);

    int insertSelective(CouponUseCondition record);

    List<CouponUseCondition> selectByExample(CouponUseConditionExample example);

    CouponUseCondition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CouponUseCondition record, @Param("example") CouponUseConditionExample example);

    int updateByExample(@Param("record") CouponUseCondition record, @Param("example") CouponUseConditionExample example);

    int updateByPrimaryKeySelective(CouponUseCondition record);

    int updateByPrimaryKey(CouponUseCondition record);
}