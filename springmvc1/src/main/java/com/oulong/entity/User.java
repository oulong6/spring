package com.oulong.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019/11/14 16:08
 * @Created by zjl
 */
@Data
public class User implements Serializable {
    private String username;
    @NotNull(message = "不能为空")
    private Integer age;
    private Date birthday;
    private List <String> hobby;

}
