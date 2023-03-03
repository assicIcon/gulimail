package com.guli.member.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * member_favorite
 *
 * @author
 */
@Data
public class MemberFavorite implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * 会员ID
	 */
	private String memberId;

	/**
	 * 收藏品关联ID
	 */
	private String relationId;

	/**
	 * 收藏名称
	 */
	private String favoriteName;

	/**
	 * 收藏类型
	 */
	private String favoriteType;

	/**
	 * 图片
	 */
	private String image;

	/**
	 * 链接
	 */
	private String link;

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
