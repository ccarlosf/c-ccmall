package com.ccarlos.ccmall.exception.http;

/**
 * @description: 被禁用异常
 * @author: ccarlos
 * @date: 2020/2/8 20:53
 */
public class ForbiddenException extends HttpException {
    public ForbiddenException(int code) {
        this.code = code;
        this.httpStatusCode = 403;
    }
}
