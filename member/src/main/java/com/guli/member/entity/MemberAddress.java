package com.guli.member.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * member_address
 * @author
 */
@Data
public class MemberAddress implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 收货人名称
     */
    private String receiverName;

    /**
     * 收货人手机
     */
    private String receiverPhone;

    /**
     * 地址类型
     */
    private Byte addressType;

    /**
     * 省
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区
     */
    private String region;

    /**
     * 街道
     */
    private String street;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 默认地址
     */
    private Byte defaultAddress;

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
