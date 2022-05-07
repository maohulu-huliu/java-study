package com.maohulu.mapstruct.demo6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huliu
 * @date 9:27 2022/5/7
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {  
    private Long id;  
    private String name;  
    private Boolean isDisable;  
}  