package com.zn.common.exception;

import com.zn.common.result.ResponseEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: Assert
 * Package: com.zn.common.exception
 * Description:
 * Created on 2025/1/12-14:02
 *
 * @author zhaonian
 */
@Slf4j
public abstract class Assert {

    /**
     * 断言对象不为空
     * 如果对象obj为空，则抛出异常
     *
     * @param obj 待判断对象
     */
    public static void notNull(Object obj, ResponseEnum responseEnum) {
        if (obj == null) {
            log.info("对象为空..........");
            throw new BusinessException(responseEnum);
        }
    }
}
