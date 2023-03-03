package com.guli.order.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * order
 *
 * @author
 */
@Data
public class Order implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 订单ID
	 */
	private String orderId;

	/**
	 * 会员ID
	 */
	private String memberId;

	/**
	 * 订单状态
	 */
	private Byte status;

	/**
	 * 总金额
	 */
	private BigDecimal totalAmount;

	/**
	 * 运费
	 */
	private BigDecimal freightAmount;

	/**
	 * 应付金额
	 */
	private BigDecimal payAmount;

	/**
	 * 下单时间
	 */
	private Date orderTime;

	/**
	 * 付款时间
	 */
	private Date payTime;

	/**
	 * 订单来源
	 */
	private String sourceType;

	/**
	 * 订单备注
	 */
	private String remark;

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
