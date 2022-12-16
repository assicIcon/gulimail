package com.guli.order.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * logistics_provider
 * @author 
 */
@Data
public class LogisticsProvider implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 物流商ID
     */
    private String logisticsProviderId;

    /**
     * 物流商名称
     */
    private String logisticsProviderName;

    /**
     * 等级
     */
    private Byte level;

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