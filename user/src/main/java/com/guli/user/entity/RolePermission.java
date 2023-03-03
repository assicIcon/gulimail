package com.guli.user.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * role_permission
 *
 * @author
 */
@Data
public class RolePermission implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 角色ID
	 */
	private String roleId;

	/**
	 * 功能ID
	 */
	private String functionId;

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
