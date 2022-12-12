package com.guli.pms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * product_spu_image
 * @author 
 */
@Data
public class ProductSpuImage implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * SPU_ID
     */
    private String spuId;

    /**
     * 图片名称
     */
    private String imageName;

    /**
     * 图片地址
     */
    private String imageUrl;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 默认图片: 0-否; 1-是;
     */
    private Byte defaultImage;

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