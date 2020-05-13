package com.springboot.mapstruct.demo.mapper;

import com.springboot.mapstruct.demo.dto.CustomerDTO;
import com.springboot.mapstruct.demo.entity.Customer;
import com.springboot.mapstruct.demo.vo.CustomerVO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-13T06:06:05+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO entityToDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setCustId( customer.getCustomerId() );
        customerDTO.setCustName( customer.getCustomerName() );
        customerDTO.setCustCode( customer.getCustomerCode() );

        return customerDTO;
    }

    @Override
    public CustomerVO entityToVO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerVO customerVO = new CustomerVO();

        customerVO.setCustomerId( customer.getCustomerId() );
        customerVO.setCustomerName( customer.getCustomerName() );
        customerVO.setCustomerCode( customer.getCustomerCode() );
        customerVO.setCustomerPhone( customer.getCustomerPhone() );
        customerVO.setCustomerAddress( customer.getCustomerAddress() );

        return customerVO;
    }
}
