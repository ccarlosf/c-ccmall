package com.ccarlos.ccmall.simple.condtion;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description: Diana条件类
 * @author: ccarlos
 * @date: 2020/2/8 15:41
 */
public class DianaCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String name = conditionContext.getEnvironment().getProperty("hero.condition");
        return "diana".equalsIgnoreCase(name);
//        return name.equalsIgnoreCase("diana");
    }
}
