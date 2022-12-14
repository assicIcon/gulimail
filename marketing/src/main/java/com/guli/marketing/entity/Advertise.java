package com.guli.marketing.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * advertise
 * @author 
 */
@Data
public class Advertise implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 广告ID
     */
    private String adId;

    /**
     * 广告位ID
     */
    private String adSpaceId;

    /**
     * 广告名称
     */
    private String advertiseName;

    /**
     * 广告图片
     */
    private String image;

    /**
     * 广告调整URL
     */
    private String url;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 广告曝光
     */
    private Long exposure;

    /**
     * 广告点击
     */
    private Long click;

    /**
     * 默认广告: 0-否; 1-是;
     */
    private Byte defaultAd;

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