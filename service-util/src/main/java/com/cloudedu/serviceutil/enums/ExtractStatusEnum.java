package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExtractStatusEnum {

	APPLICATION(1, "审核中"), PAYING(2, "支付中"), CONFIRMING(3, "确认中"), SUCCESS(4, "成功"), FAIL(5, "失败");

	private Integer code;

	private String desc;
}
