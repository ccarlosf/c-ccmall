package com.ccarlos.ccmall.simple;

import com.ccarlos.ccmall.simple.hero.Camile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {

    @Bean
    public ISkill camile(){
        return new Camile();
    }
}
