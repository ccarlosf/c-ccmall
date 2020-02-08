package com.ccarlos.ccmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.ccarlos")
public class CcmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcmallApplication.class, args);
    }

}
