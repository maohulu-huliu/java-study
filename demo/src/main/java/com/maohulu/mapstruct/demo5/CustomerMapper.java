package com.maohulu.mapstruct.demo5;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * 这里主要是这个componentModel属性，它的值就是当前要使用的依赖注入的环境\
 * #@Mapper(componentModel = “spring”)，表示把当前Mapper类纳入spring容器。可以在其它类中直接注入了：
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "name", target = "customerName")
    CustomerDto toCustomerDto(Customer customer);
}