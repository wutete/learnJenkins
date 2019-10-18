package com.travelsky.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 15:54 2018/3/22
 * @Modified By:
 */
@Controller
public class ItemController {

    @Autowired
    private CounterService counterService;

    private Logger log = LoggerFactory.getLogger(ItemController.class);
    @GetMapping("item/list")
    public String itemList(Model model){
        counterService.increment("item.service.access.count");
        model.addAttribute("username","吴特特");
        return "item/item";
    }

    public void log(){
        log.debug("======debug=======");
        log.info("======info=======");
        log.warn("=======warn======");
        log.error("======error=======");
    }
}
