package com.ccarlos.ccmall.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

/**
 * @description: 学校数据传输对象
 * @author: ccarlos
 * @date: 2020/2/9 19:50
 */
@Getter
@Setter
public class SchoolDTO {

    @Length(min=2)
    private String schoolName;
}
