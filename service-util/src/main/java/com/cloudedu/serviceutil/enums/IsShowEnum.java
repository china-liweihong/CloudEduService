package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IsShowEnum {

    YES(1, "显示"), NO(0, "不显示");

    private Integer code;

    private String desc;

}
