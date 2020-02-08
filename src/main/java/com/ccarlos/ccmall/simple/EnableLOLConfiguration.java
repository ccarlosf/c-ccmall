package com.ccarlos.ccmall.simple;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @description: lol自动装配注解
 * @author: ccarlos
 * @date: 2020/2/8 18:22
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(LOLConfigurationSelector.class)
public @interface EnableLOLConfiguration {
}
