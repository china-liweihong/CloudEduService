package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 短信类型
 *
 */
@Getter
@AllArgsConstructor
public enum MsgTypeEnum {

	SYSTEM(1, "系统消息"), OTHER(2, "其他");

	private Integer code;

	private String desc;

}
