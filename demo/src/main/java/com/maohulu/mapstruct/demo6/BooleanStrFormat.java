package com.maohulu.mapstruct.demo6;

import org.springframework.stereotype.Component;

/**
 * @author huliu
 * @date 9:26 2022/5/7
 */
@Component
public class BooleanStrFormat {

    private final static String Y = "Y";
    private final static String N = "N";

    public String toStr(Boolean isDisable) {
        if (isDisable) {
            return Y;
        } else {
            return N;
        }
    }

    public Boolean toBoolean(String str) {
        return str.equals(Y);
    }
}  