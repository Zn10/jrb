package com.zn.common.exception;

import com.zn.common.result.ResponseEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: BusinessException
 * Package: com.zn.common.exception
 * Description:
 * Created on 2025/1/12-14:00
 *
 * @author zhaonian
 */
@Data
@NoArgsConstructor
public class BusinessException extends RuntimeException {

    //状态码
    private Integer code;

    //错误消息
    private String message;

    public BusinessException(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
    }
}
