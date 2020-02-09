package com.ccarlos.ccmall.validators;

import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @description: 验证密码是否相等，自定义注解
 * @author: ccarlos
 * @date: 2020/2/9 20:10
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface PasswordEqual {
    String message() default "password are not equal";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
