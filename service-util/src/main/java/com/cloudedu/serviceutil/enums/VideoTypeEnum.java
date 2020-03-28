package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VideoTypeEnum {

	POLYV(1, "保利威视"), QINIU(2, "七牛");

	private Integer code;

	private String desc;

}
