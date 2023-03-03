package com.guli.user.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * menu_function
 *
 * @author
 */
@Data
public class MenuFunction implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 功能ID
	 */
	private String functionId;

	/**
	 * 菜单ID
	 */
	private String menuId;

	/**
	 * 分组名称
	 */
	private String functionName;

	/**
	 * 功能类型
	 */
	private Byte functionType;

	/**
	 * 功能路径
	 */
	private String requestPath;

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
