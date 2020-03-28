package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FundDirectionEnum {

    ADD(1, "增加"), SUBSTRACT(2, "减少");

    private Integer code;

    private String desc;

}
