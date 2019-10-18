package com.travelsky.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.travelsky.wute.service.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 10:55 2018/11/12
 * @Modified By:
 */
@RestController("/service")
public class ConsumerController {

    @Reference
    private DubboService dubboService;

    @RequestMapping("/dubbo")
    public String test(){
       return dubboService.sayHello();
    }
}
