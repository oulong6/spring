package com.oulong.controller;

import com.oulong.entity.User;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/11/14 15:47
 * @Created by zjl
 */
@Controller
public class UserController {
    @GetMapping("/test")
    public String success(String name) {
        System.out.println("name" + name);
        return "success";
    }

    @PostMapping("save")
    @ResponseBody
    public User insertUser(User user) {
        System.out.println(user);
        return user;
    }

    @InitBinder
    public void dateBinder(WebDataBinder dataBinder) {
        dataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-yy"));
    }

    @DeleteMapping(value = "params/**")
    public void params(Map <String, Object> map) {
        map.put("name", "源码");
        System.out.println("Dd");
//        return "test";
    }

    @PostMapping("user")
    @ResponseBody
    public User user(@RequestBody @Valid User user) {
        System.out.println(user);
        return user;
    }
}
