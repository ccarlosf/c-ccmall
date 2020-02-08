package com.ccarlos.ccmall.simple.hero;

import com.ccarlos.ccmall.simple.ISkill;

/**
 * @description: Camile
 * @author: Created by ccarlos
 * @date: 2020/2/08 09:23
 */
public class Camile implements ISkill {

    private String skillName = "Camile R";
    private String name;
    private Integer age;

    public Camile(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @description: 无参构造函数
     * @author: ccarlos
     * @date: 2020/1/22 11:52
     */
    public Camile() {
        System.out.println("Hello,Camile");
    }

    /**
     * @description: Camile技能Q
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void q() {
        System.out.println("Camile Q");
    }

    /**
     * @description: Camile技能W
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void w() {
        System.out.println("Camile W");
    }

    /**
     * @description: Camile技能E
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void e() {
        System.out.println("Camile E");
    }

    /**
     * @description: Camile技能R
     * @author: ccarlos
     * @date: 2019/12/26 22:07
     */
    @Override
    public void r() {
        System.out.println(this.skillName);
    }
}
