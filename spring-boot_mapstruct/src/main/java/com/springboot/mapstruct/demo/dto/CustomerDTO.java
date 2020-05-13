package com.springboot.mapstruct.demo.dto;

import lombok.Data;

/**
 * @author qinhuajiao
 * @date 2020年05月12日 15:11:05
 */
@Data
public class CustomerDTO {

    /**
     * 客户id
     */
    private Long custId;

    /**
     * 客户名称
     */
    private String custName;

    /**
     * 客户编码
     */
    private String custCode;

}
