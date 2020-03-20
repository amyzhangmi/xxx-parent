package com.xxx.framework.common.exception;

import com.xxx.framework.common.entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 张咪
 * @history 2020/3/2 新建
 * @since JDK1.7
 */
@ControllerAdvice
public class BaseExceptionHandler {

    Logger logger = LoggerFactory.getLogger(BaseExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        logger.error("BaseExceptionHandler-->系统异常:");
        e.printStackTrace();
        return Result.fail(999,"系统异常",e.getMessage());
    }
}
