package com.ccarlos.ccmall.core;

import com.ccarlos.ccmall.exception.http.HttpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    public UnifyResponse handleException(HttpServletRequest req, Exception e) {
        UnifyResponse message = new UnifyResponse(9999,"服务器异常","url");
        return message;
    }
    
    /**
     * @description: 处理通用异常
     * @author: ccarlos
     * @date: 2020/2/8 20:59
     * @param: req 请求
     * @param: e 异常
     * @return: void
     */
    @ExceptionHandler(HttpException.class)
    public void handleHttpException(HttpServletRequest req, HttpException e){
        System.out.println("hello");
    }
}
