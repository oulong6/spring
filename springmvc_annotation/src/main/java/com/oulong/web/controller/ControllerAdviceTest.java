package com.oulong.web.controller;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @Classname ControllerAdviceTest
 * @Description TODO
 * @Date 2019/11/14 13:15
 * @Created by zjl
 */
@ControllerAdvice
public class ControllerAdviceTest {
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        dataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }
}
