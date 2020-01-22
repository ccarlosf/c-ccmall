package com.ccarlos.ccmall.api.v1;

import com.ccarlos.ccmall.service.BannerService;
import com.ccarlos.ccmall.simple.hero.Diana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

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

    //    @Autowired
    private Diana diana;

    @Autowired
    private BannerService bannerService;

    @Autowired
    public BannerController(Diana diana) {
        this.diana = diana;
    }

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
        diana.r();
        return "Hello 商城后端";
    }
}
