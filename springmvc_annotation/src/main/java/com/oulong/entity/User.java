package com.oulong.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019/11/14 13:05
 * @Created by zjl
 */

public class User {
    private Date birthday;
    private Integer id;

    public Integer getId( ) {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthday( ) {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString( ) {
        return "User{" +
                "birthday=" + birthday +
                ", id=" + id +
                '}';
    }
}
