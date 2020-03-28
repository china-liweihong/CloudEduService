package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OperateTypeEnum {

	INCREASE(1, "增加"), EDIT(2, "修改"), DISADLE(3,"禁用");

	private Integer code;

	private String desc;

}
