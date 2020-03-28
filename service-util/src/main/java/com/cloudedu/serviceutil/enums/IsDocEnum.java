package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 是否存在文档
 */
@Getter
@AllArgsConstructor
public enum IsDocEnum {

	YES(1, "存在"), NO(0, "否");

	private Integer code;

	private String desc;

}
