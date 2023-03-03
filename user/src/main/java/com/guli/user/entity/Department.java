package com.guli.user.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * department
 *
 * @author
 */
@Data
public class Department implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 部门ID
	 */
	private String departmentId;

	/**
	 * 部门主管ID
	 */
	private String departmentManagerId;

	/**
	 * 部门名称
	 */
	private String departmentName;

	/**
	 * 状态
	 */
	private Byte status;

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
