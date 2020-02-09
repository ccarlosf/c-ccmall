package com.ccarlos.ccmall.validators;

import com.ccarlos.ccmall.dto.PersonDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @description: 密码校验类
 * @author: ccarlos
 * @date: 2020/2/9 20:18
 */
public class PasswordValidator implements ConstraintValidator<PasswordEqual, PersonDTO> {
    private int min;
    private int max;
    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
        String password1 = personDTO.getPassword1();
        String password2 = personDTO.getPassword2();
        boolean match = password1.equals(password2);

        return match;
    }
    //第二个： 自定义注解修饰的目标的类型
}
