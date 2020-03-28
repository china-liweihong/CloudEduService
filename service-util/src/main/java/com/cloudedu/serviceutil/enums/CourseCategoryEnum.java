package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CourseCategoryEnum {

	ORDINARY(1, "普通课程",""), RESOURCES(0, "资源区课程","red");
	
	private Integer code;

    private String desc;
    
    private String color;
}
