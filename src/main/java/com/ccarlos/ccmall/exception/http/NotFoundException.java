package com.ccarlos.ccmall.exception.http;

/**
 * @description: 未找到资源异常
 * @author: ccarlos
 * @date: 2020/2/8 20:52
 */
public class NotFoundException extends HttpException{

    public NotFoundException(int code){
        this.httpStatusCode = 404;
        this.code = code;
    }
}
