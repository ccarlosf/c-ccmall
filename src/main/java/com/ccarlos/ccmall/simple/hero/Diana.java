package com.ccarlos.ccmall.simple.hero;

import com.ccarlos.ccmall.simple.ISkill;
import org.springframework.stereotype.Component;

/**
 * @description: 英雄皎月 Diana
 * @author: Created by ccarlos
 * @date: 2019/12/26 22:04
 */
@Component
public class Diana implements ISkill {

    private String skillName = "Diana R";

    /**
     * @description: 无参构造函数
     * @author: ccarlos
     * @date: 2020/1/22 11:52
     */
    public Diana() {
        System.out.println("Hello,Diana");
    }

    /**
     * @description: Diana技能Q
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void q() {
        System.out.println("Diana Q");
    }

    /**
     * @description: Diana技能W
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void w() {
        System.out.println("Diana W");
    }

    /**
     * @description: Diana技能E
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void e() {
        System.out.println("Diana E");
    }

    /**
     * @description: Diana技能R
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void r() {
        System.out.println(this.skillName);
    }
}
