package com.guli.product.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * product_sku_sale_attr
 *
 * @author
 */
@Data
public class ProductSkuSaleAttr implements Serializable {
	/**
	 * 自增ID
	 */
	private Long id;

	/**
	 * SKU_ID
	 */
	private String skuId;

	/**
	 * 属性ID
	 */
	private String attrId;

	/**
	 * 属性名称
	 */
	private String attrName;

	/**
	 * 属性值
	 */
	private String attrValue;

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
