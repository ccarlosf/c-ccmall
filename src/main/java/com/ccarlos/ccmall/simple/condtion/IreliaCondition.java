package com.ccarlos.ccmall.simple.condtion;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description: Irelia条件类
 * @author: ccarlos
 * @date: 2020/2/8 15:41
 */
public class IreliaCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String name = conditionContext.getEnvironment().getProperty("hero.condition");
        return "irelia".equalsIgnoreCase(name);
    }
}
