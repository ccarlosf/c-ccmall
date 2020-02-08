package com.ccarlos.ccmall.exception.http;

/**
 * @description: Http异常类
 * @author: ccarlos
 * @date: 2020/2/8 20:50
 */
public class HttpException extends RuntimeException{
    protected Integer code;
    protected Integer httpStatusCode = 500;

    public Integer getCode() {
        return code;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }
}
