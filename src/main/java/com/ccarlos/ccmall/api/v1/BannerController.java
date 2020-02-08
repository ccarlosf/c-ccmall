package com.ccarlos.ccmall.api.v1;

import com.ccarlos.ccmall.simple.IConnect;
import com.ccarlos.ccmall.simple.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description: Banner控制器
 * @author: Created by ccarlos
 * @date: 2019/12/23 23:12
 */
@RestController
@RequestMapping("/v1/banner")
public class BannerController {


    @Autowired
//    @Qualifier("irelia")
    private ISkill iSkill;

    @Autowired
    private IConnect iConnect;

    /**
     * @description: 测试方法
     * @author: ccarlos
     * @date: 2019/12/23 23:13
     * @return: java.lang.String
     */
    //RestFul API
    //自描述性
    //host:port/v1/banner/test
    //header version:v1
    //url?version = v1
    @GetMapping("/test")
    public String test(HttpServletResponse response) throws IOException {
        iSkill.r();
        return "Hello 商城后端";
    }

    /**
     * @description: 测试方法1
     * @author: ccarlos
     * @date: 2020/2/8 11:15
     * @return: void
     */
    @GetMapping("/test1")
    public void test1() {
        iConnect.connect();
    }
}
