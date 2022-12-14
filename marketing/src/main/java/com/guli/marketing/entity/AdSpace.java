package com.guli.marketing.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ad_space
 * @author 
 */
@Data
public class AdSpace implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 广告位ID
     */
    private String adSpaceId;

    /**
     * 广告位名称
     */
    private String adSpaceName;

    /**
     * 生效状态: 0-有效; 1-无效;
     */
    private Byte validStatus;

    /**
     * 位置
     */
    private String position;

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