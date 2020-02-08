package com.ccarlos.ccmall.simple.hero;

import com.ccarlos.ccmall.simple.ISkill;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @description: 英雄皎月 Irelia
 * @author: Created by ccarlos
 * @date: 2019/12/26 22:04
 */
//@Component
//@Primary
public class Irelia implements ISkill {

    /**
     * @description: 无参构造函数
     * @author: ccarlos
     * @date: 2020/1/22 11:52
     */
    public Irelia(){
        System.out.println("Hello,Irelia");
    }

    /**
     * @description: Irelia技能Q
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void q() {
        System.out.println("Irelia Q");
    }

    /**
     * @description: Irelia技能W
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void w() {
        System.out.println("Irelia W");
    }

    /**
     * @description: Irelia技能E
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void e() {
        System.out.println("Irelia E");
    }

    /**
     * @description: Irelia技能R
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void r() {
        System.out.println("Irelia R");
    }

}
