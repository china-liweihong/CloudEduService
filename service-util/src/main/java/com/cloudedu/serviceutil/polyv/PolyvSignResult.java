package com.cloudedu.serviceutil.polyv;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 课时信息获取sign值
 * 
 * @author forest
 */
@Data
@Accessors(chain = true)
public class PolyvSignResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ts;

    private String sign;

    private String token;

}
