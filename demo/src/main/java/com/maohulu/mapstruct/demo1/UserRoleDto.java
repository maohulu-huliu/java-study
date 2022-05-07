package com.maohulu.mapstruct.demo1;

import lombok.Data;

/**
 * @author huliu
 * @date 17:39 2022/5/6
 */
@Data
public class UserRoleDto {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户名
     */
    private String name;
    /**
     * 角色名
     */
    private String roleName;
}  