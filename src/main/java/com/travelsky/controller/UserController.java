package com.travelsky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 14:50 2018/3/22
 * @Modified By:
 */
//@RestController
public class UserController {

    @GetMapping("hello/{name}")
    public String hello(@PathVariable("name") String name, HttpServletRequest request){
        return "hello!"+name+request.getRemoteHost()  ;
    }
}
