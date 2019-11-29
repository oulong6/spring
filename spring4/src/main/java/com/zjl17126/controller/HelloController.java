package com.zjl17126.controller;

import com.zjl17126.entity.User;
import com.zjl17126.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zjl
 */
@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("hello")
    public String hello(){
        userService.getUser(23);
        return "hello";
    }
    @RequestMapping("hello2")
    @ResponseBody
    public User hello2(){
        User user = new User( );
        user.setName("Dfd");
        user.setAge(12);
        return user;
    }
    @RequestMapping(value = "user",method = RequestMethod.POST)
    public String user(User user){
        System.out.println(user );
        return "success";
    }
    @RequestMapping(value = "ajax1",method = RequestMethod.POST)
    @ResponseBody
    public User user1(@RequestBody User user){
        System.out.println(user );
        return user;
    }
    @RequestMapping(value = "file",method = RequestMethod.POST)
    public String fileUpload(HttpServletRequest request,@RequestParam("file") MultipartFile multipartFile) throws IOException {
        String realPath = request.getServletContext( ).getRealPath("/uploads/");
        File file = new File(realPath);
        String filename = multipartFile.getOriginalFilename( );
        if ( !file.exists() ){
            file.mkdirs();
        }
        InputStream inputStream = multipartFile.getInputStream( );
        multipartFile.transferTo(file);
        return "";
    }


}
