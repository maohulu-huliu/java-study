package com.maohulu.mapstruct.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author huliu
 * @date 17:39 2022/5/6
 */
@AllArgsConstructor
@Data
public class User {  
    private Long id;  
    private String username;  
    private String password;  
    private String phoneNum;  
    private String email;  
    private Role role;
}  