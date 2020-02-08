package com.ccarlos.ccmall.core.hack;

import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/**
 * @description: 自动前缀url映射
 * @author: ccarlos
 * @date: 2020/2/8 23:15
 */
public class AutoPrefixUrlMapping extends RequestMappingHandlerMapping {

    /**
     * @description: 根据方法名获取mapping信息
     * @author: ccarlos
     * @date: 2020/2/8 23:20
     * @param: method
     * @param: handlerType
     * @return: org.springframework.web.servlet.mvc.method.RequestMappingInfo
     */
    @Override
    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {
        RequestMappingInfo mappingInfo = super.getMappingForMethod(method, handlerType);
        String packageName = this.getPrefix(handlerType);
        if(mappingInfo !=null){

        }
        return mappingInfo;
    }

    /**
     * @description: 获取前缀信息
     * @author: ccarlos
     * @date: 2020/2/8 23:19
     * @param: handlerType
     * @return: java.lang.String
     */
    private String getPrefix(Class<?> handlerType){
        String packageName = handlerType.getPackage().getName();
        return packageName;
    }
}
