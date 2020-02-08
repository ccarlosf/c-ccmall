package com.ccarlos.ccmall.simple;

import com.ccarlos.ccmall.simple.database.MySQL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: Database配置类
 * @author: ccarlos
 * @date: 2020/2/8 10:32
 */
@Configuration
public class DatabaseConfiguration {

    @Value("${mysql.ip}")
    private String ip;

    @Value("${mysql.port}")
    private Integer port;

    /**
     * @description: 实例化mysql
     * @author: ccarlos
     * @date: 2020/2/8 10:34
     * @return: com.ccarlos.ccmall.simple.IConnect
     */
//    @Bean
    public IConnect mysql() {
        return new MySQL(ip, port);
    }
}
