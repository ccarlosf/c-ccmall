package com.ccarlos.ccmall.dto;

import com.ccarlos.ccmall.validators.PasswordEqual;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.Max;

/**
 * @description: 用户数据传输对象
 * @author: ccarlos
 * @date: 2020/2/9 14:21
 */
@Builder
@Getter
@PasswordEqual(min = 1,message = "两次密码不相同")
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
//@Data
//@EqualsAndHashCode
// equals hashCode toString
public class PersonDTO {
//    @NonNull
    @Length(min=2,max = 10,message = "xxxxxx")
//    @PasswordEqual
    private String name;

//    @Max()
    private Integer age;

//    @Valid
//    private SchoolDTO schoolDTO;


//    @PasswordEqual
    private String password1;
    private String password2;
}
