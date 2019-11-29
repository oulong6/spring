package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019/11/13 11:48
 * @Created by zjl
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println(name );
        return "index";
    }
    @RequestMapping("test")
    private void test(){}
}
