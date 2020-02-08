package com.ccarlos.ccmall.core;

/**
 * @description: 异常封装类
 * @author: ccarlos
 * @date: 2020/2/8 21:05
 */
public class UnifyResponse {
    private int code;
    private String message;
    private String request;

    public UnifyResponse(int code, String message, String request) {
        this.code = code;
        this.message = message;
        this.request = request;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getRequest() {
        return request;
    }
}
