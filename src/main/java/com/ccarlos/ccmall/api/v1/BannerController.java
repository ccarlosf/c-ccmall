package com.ccarlos.ccmall.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description: Banner控制器
 * @author: Created by ccarlos
 * @date: 2019/12/23 23:12
 */
@Controller
public class BannerController {

    /**
     * @description: 测试方法
     * @author: ccarlos
     * @date: 2019/12/23 23:13
     * @return: java.lang.String
     */
    @GetMapping("/test")
    public void test(HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello 商城后端");
//        return "Hello World";
    }
}
