package com.guli.member.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * member_integration_flow
 * @author
 */
@Data
public class MemberIntegrationFlow implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 积分
     */
    private Integer integration;

    /**
     * 积分来源
     */
    private String sourceType;

    /**
     * 备注
     */
    private String remark;

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
