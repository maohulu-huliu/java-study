package com.maohulu.mapstruct.demo2;

import com.maohulu.mapstruct.demo1.User;
import com.maohulu.mapstruct.demo1.UserRoleDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;


/**
 * @author huliu
 * @date 17:58 2022/5/6
 */
@Mapper
public abstract class UserRoleMapper {

    /**
     * 获取该类自动生成的实现类的实例
     * 接口中的属性都是 public static final 的 方法都是public abstract的
     */
    public static final UserRoleMapper INSTANCES = Mappers.getMapper(UserRoleMapper.class);

    /**
     * 这个方法就是用于实现对象属性复制的方法
     *
     * @param user 这个参数就是源对象，也就是需要被复制的对象
     * @return 返回的是目标对象，就是最终的结果对象
     * @Mapping 用来定义属性复制规则 source 指定源对象属性 target指定目标对象属性
     */
    @Mappings({
            @Mapping(source = "id", target = "userId"),
            @Mapping(source = "username", target = "name"),
            @Mapping(source = "role.roleName", target = "roleName")
    })
    public abstract UserRoleDto toUserRoleDto(User user);

    /**
     * 提供默认方法，方法自己定义，这个方法是我随便写的，不是要按照这个格式来的
     */
    UserRoleDto defaultConvert() {
        UserRoleDto userRoleDto = new UserRoleDto();
        userRoleDto.setUserId(0L);
        userRoleDto.setName("None");
        userRoleDto.setRoleName("None");
        return userRoleDto;
    }

}  