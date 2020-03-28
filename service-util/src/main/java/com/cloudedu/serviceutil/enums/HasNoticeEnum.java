package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HasNoticeEnum {

	YES(1, "已提醒"), NO(0, "未提醒");

	private Integer code;

	private String desc;

}
