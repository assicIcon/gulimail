package com.guli.marketing.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * coupon_batch
 *
 * @author
 */
@Data
public class CouponBatch implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 优惠券批次ID
	 */
	private String couponBatchId;

	/**
	 * 优惠券名称
	 */
	private String couponName;

	/**
	 * 优惠券图片
	 */
	private String image;

	/**
	 * 生效状态: 0-有效; 1-无效;
	 */
	private Byte validStatus;

	/**
	 * 优惠券类型
	 */
	private String couponType;

	/**
	 * 优惠券折扣
	 */
	private BigDecimal discount;

	/**
	 * 折扣单位
	 */
	private String unit;

	/**
	 * 数量
	 */
	private Integer count;

	/**
	 * 可领取开始时间
	 */
	private Date enableStartTime;

	/**
	 * 可领取结束时间
	 */
	private Date enableEndTime;

	/**
	 * 使用时间类型
	 */
	private String availableTimeType;

	/**
	 * 使用时间规则
	 */
	private String availableTimeRule;

	/**
	 * 描述
	 */
	private String description;

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
