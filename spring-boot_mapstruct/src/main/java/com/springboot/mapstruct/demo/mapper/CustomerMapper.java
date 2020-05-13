package com.springboot.mapstruct.demo.mapper;

import com.springboot.mapstruct.demo.dto.CustomerDTO;
import com.springboot.mapstruct.demo.entity.Customer;
import com.springboot.mapstruct.demo.vo.CustomerVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author qinhuajiao
 * @date 2020年05月12日 15:12:58
 */
@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    /**
     * 实体映射生成dto
     * @param customer
     * @return
     */
    @Mappings({
            @Mapping(source = "customerId", target = "custId"),
            @Mapping(source = "customerName", target = "custName"),
            @Mapping(source = "customerCode", target = "custCode")
    })
    CustomerDTO entityToDTO(Customer customer);

    /**
     * 实体映射生成VO
     * @param customer
     * @return
     */
    CustomerVO entityToVO(Customer customer);
}
