package com.ccarlos.ccmall.simple.hero;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @description: 英雄皎月 Diana
 * @author: Created by ccarlos
 * @date: 2019/12/26 22:04
 */
@Component
@Lazy
public class Diana {

    /**
     * @description: 无参构造函数
     * @author: ccarlos
     * @date: 2020/1/22 11:52
     */
    public Diana(){
        System.out.println("Hello,Diana");
    }

    /**
     * @description: Diana技能Q
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    public void q() {
        System.out.println("Diana Q");
    }

    /**
     * @description: Diana技能W
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    public void w() {
        System.out.println("Diana W");
    }

    /**
     * @description: Diana技能E
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    public void e() {
        System.out.println("Diana E");
    }

    /**
     * @description: Diana技能R
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    public void r() {
        System.out.println("Diana R");
    }
}
