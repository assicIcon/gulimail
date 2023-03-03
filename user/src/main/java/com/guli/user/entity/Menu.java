package com.guli.user.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * menu
 *
 * @author
 */
@Data
public class Menu implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 菜单ID
	 */
	private String menuId;

	/**
	 * 父菜单ID
	 */
	private String parentMenuId;

	/**
	 * 菜单名称
	 */
	private String menuName;

	/**
	 * 排序
	 */
	private Integer sort;

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
