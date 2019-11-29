package com.zjl17126.entity;

import java.util.Date;

/**
 * @author zjl
 */
public class User {
    private String name;
    private Integer age;
    private Date birthDay;

    public Date getBirthDay( ) {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge( ) {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString( ) {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                '}';
    }
}
