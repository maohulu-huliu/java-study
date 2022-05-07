package com.maohulu.mapstruct.demo4;

import com.maohulu.mapstruct.demo1.User;
import com.maohulu.mapstruct.demo1.UserRoleDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author huliu
 * @date 18:02 2022/5/6
 */
@Mapper
public interface UserRoleMapper1 {

    UserRoleMapper1 INSTANCES = Mappers.getMapper(UserRoleMapper1.class);

    @Mappings({
            @Mapping(source = "userId", target = "id"),
            @Mapping(source = "name", target = "username"),
            @Mapping(source = "roleName", target = "role.roleName")
    })
    void updateDto(UserRoleDto userRoleDto, @MappingTarget User user);


    @Mappings({
            @Mapping(source = "id", target = "userId"),
            @Mapping(source = "username", target = "name"),
            @Mapping(source = "role.roleName", target = "roleName")
    })
    void update(User user, @MappingTarget UserRoleDto userRoleDto);

}  