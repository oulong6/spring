package com.oulong.web.controller;

import com.oulong.entity.User;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019/11/13 20:41
 * @Created by zjl
 */
@Controller
@SessionAttributes("user")
public class HelloController {
    @RequestMapping(value = "hello",method = RequestMethod.POST)
    public String hello(){
        return "success";

    }
    @RequestMapping("/date")
    public String test(User user){
        return "success";
    }
//    @InitBinder
//    public void initBinder(WebDataBinder dataBinder){
//        dataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
//    }
    @RequestMapping("cookieTest")
    @ResponseBody
    public String cookie(@CookieValue("JSESSIONID")String cookie){
        return cookie;
    }
    @ModelAttribute
    public User user(User user){
        System.out.println(user+";;" );
        user.setId(12);
        return user;
    }
    @RequestMapping("/list")
    public String test2(List<String> s){
        System.out.println( s.toArray());
        return "Dd";
    }

}
