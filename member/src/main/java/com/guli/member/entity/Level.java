package com.guli.member.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * level
 *
 * @author
 */
@Data
public class Level implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 等级ID
	 */
	private String levelId;

	/**
	 * 等级名称
	 */
	private String levelName;

	/**
	 * 图标
	 */
	private String icon;

	/**
	 * 需要成长值
	 */
	private Integer growthPoint;

	/**
	 * 默认等级: 0-否; 1-是;
	 */
	private Byte defaultLevel;

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
