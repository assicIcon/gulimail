package com.guli.member.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * privilege
 * @author
 */
@Data
public class Privilege implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 特权ID
     */
    private String privilegeId;

    /**
     * 特权名称
     */
    private String privilegeName;

    /**
     * 图标
     */
    private String icon;

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
