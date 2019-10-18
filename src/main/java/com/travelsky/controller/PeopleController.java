package com.travelsky.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 10:21 2018/3/26
 * @Modified By:
 */
@RestController
public class PeopleController {

    @ExceptionHandler(value = Exception.class)
    public String error(Exception e){
        return "File  not found Exception"+e.getMessage();
    }

    @GetMapping("people/error1")
    public void error1() throws FileNotFoundException{
        throw new FileNotFoundException("people not find ");
    }

    @GetMapping("people/error2")
    public void error2() throws ClassNotFoundException{
        throw new ClassNotFoundException("people class not find ");
    }
}
