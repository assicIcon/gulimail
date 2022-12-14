package com.guli.marketing.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * coupon_use_condition
 * @author 
 */
@Data
public class CouponUseCondition implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 优惠券批次ID
     */
    private String couponBatchId;

    /**
     * 条件类型
     */
    private String type;

    /**
     * 使用条件
     */
    private String useCondition;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}