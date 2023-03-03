package com.guli.product.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * product_spu_description
 *
 * @author
 */
@Data
public class ProductSpuDescription implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * SPU_ID
	 */
	private String spuId;

	/**
	 * 产品详情
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
