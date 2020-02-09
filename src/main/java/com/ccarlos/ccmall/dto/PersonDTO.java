package com.ccarlos.ccmall.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @description: 用户数据传输对象
 * @author: ccarlos
 * @date: 2020/2/9 14:21
 */
@Getter
@Setter
//@Data
//@EqualsAndHashCode
// equals hashCode toString
public class PersonDTO {
    private String name;
    private Integer age;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
}
