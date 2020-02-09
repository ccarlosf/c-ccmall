package com.ccarlos.ccmall.api.v1;

import com.ccarlos.ccmall.dto.PersonDTO;
import com.ccarlos.ccmall.exception.http.ForbiddenException;
import com.ccarlos.ccmall.exception.http.NotFoundException;
import com.ccarlos.ccmall.simple.IConnect;
import com.ccarlos.ccmall.simple.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

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

//    @Autowired
//    private IConnect iConnect;

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
    @PostMapping("/test/{id1}")
    public String test(@PathVariable(name = "id1") Integer id,
                       @RequestParam String name,
                       @RequestBody PersonDTO person)  {
        iSkill.r();
//        PersonDTO dto = new PersonDTO();
        PersonDTO dto = PersonDTO.builder()
                .name("9yue")
                .age(18)
                .build();
        throw new ForbiddenException(10000);
//        throw new Exception("这里错了");
//        return "Hello 商城后端";
    }

    /**
     * @description: 测试方法1
     * @author: ccarlos
     * @date: 2020/2/8 11:15
     * @return: void
     */
//    @GetMapping("/test1")
//    public void test1() {
//        iConnect.connect();
//    }
}
