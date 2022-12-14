package com.guli.marketing.mapper;

import com.guli.marketing.entity.CouponBatch;
import com.guli.marketing.entity.CouponBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponBatchMapper {
    long countByExample(CouponBatchExample example);

    int deleteByExample(CouponBatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CouponBatch record);

    int insertSelective(CouponBatch record);

    List<CouponBatch> selectByExample(CouponBatchExample example);

    CouponBatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CouponBatch record, @Param("example") CouponBatchExample example);

    int updateByExample(@Param("record") CouponBatch record, @Param("example") CouponBatchExample example);

    int updateByPrimaryKeySelective(CouponBatch record);

    int updateByPrimaryKey(CouponBatch record);
}