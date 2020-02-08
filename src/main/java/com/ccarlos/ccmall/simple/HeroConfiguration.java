package com.ccarlos.ccmall.simple;

import com.ccarlos.ccmall.simple.hero.Diana;
import com.ccarlos.ccmall.simple.hero.Irelia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: Hero配置类
 * @author: ccarlos
 * @date: 2020/2/8 10:32
 */
@Configuration
public class HeroConfiguration {

    /**
     * @description: 实例化diana
     * @author: ccarlos
     * @date: 2020/2/8 10:17
     * @return: com.ccarlos.ccmall.simple.ISkill
     */
//    @Bean
//    @ConditionalOnMissingBean(name = "mysql")
//    @ConditionalOnProperty(value = "hero.condition", havingValue = "diana", matchIfMissing = true)
//    @Conditional(DianaCondition.class)
    public ISkill diana(){
        return new Diana("Diana",18);
    }

    /**
     * @description: 实例化irelia
     * @author: ccarlos
     * @date: 2020/2/8 10:17
     * @return: com.ccarlos.ccmall.simple.ISkill
     */
    @Bean
//    @ConditionalOnProperty(value = "hero.condition", havingValue = "irelia")
//    @Conditional(IreliaCondition.class)
    public ISkill irelia(){
        return new Irelia();
    }
}
