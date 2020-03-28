package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 是否显示客服信息
 */
@Getter
@AllArgsConstructor
public enum IsShowServiceEnum {

	YES(1, "是"), NO(0, "否");

	private Integer code;

	private String desc;
}
