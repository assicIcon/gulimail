package com.guli.member.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * member
 *
 * @author
 */
@Data
public class Member implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 会员ID
	 */
	private String memberId;

	/**
	 * 等级
	 */
	private String levelId;

	/**
	 * 用户名称
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 手机号
	 */
	private String phoneNumber;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 头像
	 */
	private String avatar;

	/**
	 * 性别: 0-女; 1-男;
	 */
	private Byte gender;

	/**
	 * 出生日期
	 */
	private Date birthDay;

	/**
	 * 城市
	 */
	private String city;

	/**
	 * 状态
	 */
	private Byte status;

	/**
	 * 积分
	 */
	private Integer integration;

	/**
	 * 成长值
	 */
	private Integer growthPoint;

	/**
	 * 用户来源
	 */
	private String sourceType;

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
