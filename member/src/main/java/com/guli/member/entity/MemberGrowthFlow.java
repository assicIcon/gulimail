package com.guli.member.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * member_growth_flow
 *
 * @author
 */
@Data
public class MemberGrowthFlow implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 会员ID
	 */
	private String memberId;

	/**
	 * 成长值
	 */
	private Integer growthPoint;

	/**
	 * 成长值来源
	 */
	private String sourceType;

	/**
	 * 备注
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
