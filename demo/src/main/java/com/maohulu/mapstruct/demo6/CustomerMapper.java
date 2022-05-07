package com.maohulu.mapstruct.demo6;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * 要注意的是，如果使用了例如像spring这样的环境，Mapper引入uses类实例的方式将是自动注入，那么这个类也应该纳入Spring容器：
 *
 * @author huliu
 * @date 9:25 2022/5/7
 */
@Mapper(componentModel = "spring", uses = {BooleanStrFormat.class})
public interface CustomerMapper {

    CustomerMapper INSTANCES = Mappers.getMapper(CustomerMapper.class);

    @Mappings({
            @Mapping(source = "name", target = "customerName"),
            @Mapping(source = "isDisable", target = "disable")
    })
    CustomerDto toCustomerDto(Customer customer);
}  