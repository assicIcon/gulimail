package com.guli.order.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * logistics_provider_contact
 * @author 
 */
@Data
public class LogisticsProviderContact implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 物流商ID
     */
    private String logisticsProviderId;

    /**
     * 联系人名称
     */
    private String contractName;

    /**
     * 联系人手机号码
     */
    private String phoneNumber;

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