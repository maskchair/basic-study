package com.springboot.mapstruct.demo;


import com.springboot.mapstruct.demo.dto.CustomerDTO;
import com.springboot.mapstruct.demo.entity.Customer;
import com.springboot.mapstruct.demo.mapper.CustomerMapper;
import com.springboot.mapstruct.demo.vo.CustomerVO;
import org.junit.Test;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qinhuajiao
 * @date 2020年05月12日 15:28:50
 */
public class MapStructApplicationTest {


    @Test
    public void entityToDTO(){
        CustomerDTO customerDTO = CustomerMapper.INSTANCE.entityToDTO(getEntity());
        System.out.println(customerDTO);

    }

    @Test
    public void entityToVO(){
        CustomerVO customerVO = CustomerMapper.INSTANCE.entityToVO(getEntity());
        System.out.println(customerVO);

    }

    private Customer getEntity(){
        Customer customer = new Customer();
        customer.setCustomerId(1L);
        customer.setCustomerCode("001");
        customer.setCustomerName("张三");
        customer.setCustomerAddress("浙江省杭州市");
        customer.setCustomerPhone("13556894785");
        customer.setCreateTIme(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        customer.setCreator("李四");
        return customer;
    }
}
