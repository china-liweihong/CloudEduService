package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 视频上传状态
 */
@Getter
@AllArgsConstructor
public enum VideoStatusEnum {

	WAIT(1, "待上传", ""), SUCCES(2, "上传成功", "green"),FINAL(3, "上传失败", "red");
	
	private Integer code;

	private String desc;
	
	private String color;

}
