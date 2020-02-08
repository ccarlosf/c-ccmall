package com.ccarlos.ccmall.simple.database;

import com.ccarlos.ccmall.simple.IConnect;

/**
 * @description: MySQL配置类
 * @author: ccarlos
 * @date: 2020/2/8 10:28
 */
public class MySQL implements IConnect {

    private String ip="localhost";

    private Integer port=3306;

    public MySQL(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }

    public MySQL() {
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * @description: 连接方法
     * @author: ccarlos
     * @date: 2020/2/8 10:29
     * @return: void
     */
    @Override
    public void connect() {
        System.out.println(this.ip+":"+this.port);
    }
}
