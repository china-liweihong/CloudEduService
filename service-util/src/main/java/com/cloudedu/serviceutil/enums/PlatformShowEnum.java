package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 平台展示枚举类
 *
 */
@Getter
@AllArgsConstructor
public enum PlatformShowEnum {

	PC(1, "PC端", ""), EDIT(0, "微信端","green");

	private Integer code;

	private String desc;
	
	private String color;

}
