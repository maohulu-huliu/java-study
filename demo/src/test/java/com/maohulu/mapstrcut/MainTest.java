package com.maohulu.mapstrcut;

import com.maohulu.mapstruct.demo1.Role;
import com.maohulu.mapstruct.demo1.User;
import com.maohulu.mapstruct.demo1.UserRoleDto;
import com.maohulu.mapstruct.UserRoleMapper;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    User user = null;

    /**
     * 模拟从数据库中查出user对象
     */
    @Before
    public void before() {
        Role role = new Role(2L, "administrator", "超级管理员");
        user = new User(1L, "zhangsan", "12345", "17677778888", "123@qq.com", role);
    }

    /**
     * 模拟把user对象转换成UserRoleDto对象
     */
    @Test
    public void test1() {
        UserRoleDto userRoleDto = new UserRoleDto();
        userRoleDto.setUserId(user.getId());
        userRoleDto.setName(user.getUsername());
        userRoleDto.setRoleName(user.getRole().getRoleName());
        System.out.println(userRoleDto);
    }

    @Test
    public void test2() {
        UserRoleDto userRoleDto = UserRoleMapper.INSTANCES.toUserRoleDto(user);
        System.out.println(userRoleDto);
    }

    @Test
    public void test3() {
        UserRoleMapper userRoleMapperInstances = UserRoleMapper.INSTANCES;
        UserRoleDto userRoleDto = userRoleMapperInstances.defaultConvert();
        System.out.println(userRoleDto);
    }

    @Test
    public void test4() {
        UserRoleMapper instances = UserRoleMapper.INSTANCES;
        UserRoleDto userRoleDto = instances.useParameter(user, "myUserRole");
        System.out.println(userRoleDto);
    }

}