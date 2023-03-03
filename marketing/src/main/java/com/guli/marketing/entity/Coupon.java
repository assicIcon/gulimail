package com.guli.marketing.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * coupon
 *
 * @author
 */
@Data
public class Coupon implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 优惠券ID
	 */
	private String couponId;

	/**
	 * 优惠券批次ID
	 */
	private String couponBatchId;

	/**
	 * 状态: 0-未发放; 1-已发放; 2-已使用;
	 */
	private Byte status;

	/**
	 * 兑换码
	 */
	private String redemptionCode;

	/**
	 * 可用开始时间
	 */
	private Date availableStartTime;

	/**
	 * 可用结束时间
	 */
	private Date availableEndTime;

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
