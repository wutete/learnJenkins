package com.travelsky.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 16:37 2018/3/29
 * @Modified By:
 */
//@Aspect
//@Component
public class logAspect {

    @Before("execution(* com.travelsky.controller.ItemController.itemList(..))")
    public void test1(){
        System.out.println("======log test success=====");
    }
}
