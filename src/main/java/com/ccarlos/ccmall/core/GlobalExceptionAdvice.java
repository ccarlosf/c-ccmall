package com.ccarlos.ccmall.core;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @description: 全局异常处理类
 * @author: ccarlos
 * @date: 2020/2/8 19:46
 */
@ControllerAdvice
public class GlobalExceptionAdvice {

    /**
     * @description: 处理通用异常
     * @author: ccarlos
     * @date: 2020/2/8 19:46
     * @return: void
     */
    @ExceptionHandler(value = Exception.class)
    public void handleException(HttpServletRequest req, Exception e) {
        System.out.println("hello");
    }
}
