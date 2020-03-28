package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 是否高亮(1高亮;0不高亮)
 */
@Getter
@AllArgsConstructor
public enum IsHfield {

	NO(0, "不高亮"), YES(1, "高亮");

	private Integer code;

	private String desc;

}
