package com.maohulu.mapstruct.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author huliu
 * @date 17:38 2022/5/6
 */
@AllArgsConstructor
@Data
public class Role {
    private Long id;
    private String roleName;
    private String description;
}  