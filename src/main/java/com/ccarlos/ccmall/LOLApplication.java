package com.ccarlos.ccmall;

import com.ccarlos.ccmall.simple.ISkill;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class LOLApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(LOLApplication.class)
                .run(args);
        ISkill iSkill = (ISkill) context.getBean("irelia");
        iSkill.r();
    }
}
