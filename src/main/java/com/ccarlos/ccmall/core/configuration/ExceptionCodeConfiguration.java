package com.ccarlos.ccmall.core.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 异常状态码配置类
 * @author: ccarlos
 * @date: 2020/2/8 22:16
 */
@ConfigurationProperties(prefix = "ccmall")
@PropertySource(value = "classpath:config/exception-code.properties")
@Component
public class ExceptionCodeConfiguration {

    private Map<Integer,String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setCodes(Map<Integer, String> codes) {
        this.codes = codes;
    }

    /**
     * @description: 获取异常提示信息
     * @author: ccarlos
     * @date: 2020/2/8 22:19
     * @param: code
     * @return: java.lang.String
     */
    public String getMessage(int code){
        String message = codes.get(code);
        return message;
    }
}
