package com.ccarlos.ccmall.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description: Banner控制器
 * @author: Created by ccarlos
 * @date: 2019/12/23 23:12
 */
@RestController
public class BannerController {

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
    @GetMapping("/v1/banner/test")
    public String test(HttpServletResponse response) throws IOException {
        return "Hello 商城后端";
    }
}
