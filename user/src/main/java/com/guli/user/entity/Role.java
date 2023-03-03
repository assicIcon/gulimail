package com.guli.user.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * role
 *
 * @author
 */
@Data
public class Role implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 角色ID
	 */
	private String roleId;

	/**
	 * 父角色ID
	 */
	private String parentRoleId;

	/**
	 * 角色名称
	 */
	private String roleName;

	/**
	 * 有效的: 0-否; 1-是;
	 */
	private Byte validStatus;

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
