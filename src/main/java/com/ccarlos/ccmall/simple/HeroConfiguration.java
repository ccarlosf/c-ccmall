package com.ccarlos.ccmall.simple;

import com.ccarlos.ccmall.simple.hero.Camile;
import com.ccarlos.ccmall.simple.hero.Irelia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {

    /**
     * @description: 实例化camile
     * @author: ccarlos
     * @date: 2020/2/8 10:17
     * @return: com.ccarlos.ccmall.simple.ISkill
     */
    @Bean
    public ISkill camile(){
        return new Camile("Camile",18);
    }

    /**
     * @description: 实例化irelia
     * @author: ccarlos
     * @date: 2020/2/8 10:17
     * @return: com.ccarlos.ccmall.simple.ISkill
     */
    @Bean
    public ISkill irelia(){
        return new Irelia();
    }
}
