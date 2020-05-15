package com.springboot.mapstruct.demo.entity;

import lombok.Data;

/**
 * <p>客户实体类</p>
 * @author qinhuajiao
 * @date 2020年05月12日 14:54:49
 */
@Data
public class Customer {

    /**
     * 客户id
     */
    private Long customerId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户编码
     */
    private String customerCode;

    /**
     * 客户联系方式
     */
    private String customerPhone;

    /**
     * 客户地址
     */
    private String customerAddress;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人
     */
    private String creator;

}
