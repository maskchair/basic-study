package com.springboot.mapstruct.demo.vo;

import lombok.Data;

/**
 * @author qinhuajiao
 * @date 2020年05月12日 15:22:05
 */
@Data
public class CustomerVO {
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

}
