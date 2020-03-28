package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IsPutawayEnum {

	YES(1, "上架", ""), NO(0, "下架", "red");
	
	private Integer code;

    private String desc;
    
    private String color;
}
