package com.springmvc;
import com.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "index";
    }
    @RequestMapping(value = "user",method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
    public void user(@RequestBody User user){
        System.out.println(user );
    }
}
