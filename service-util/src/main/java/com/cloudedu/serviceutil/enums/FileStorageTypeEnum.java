package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum FileStorageTypeEnum {

	DOC(1, "附件"), PICTURE(2, "图片"), VIDEO(3, "视频");

	private Integer code;

	private String desc;

}
