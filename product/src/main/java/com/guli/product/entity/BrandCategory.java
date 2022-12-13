package com.guli.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * brand_category
 * @author
 */
@Data
public class BrandCategory implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 品牌ID
     */
    private String brandId;

    /**
     * 分类ID
     */
    private String categoryId;

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
