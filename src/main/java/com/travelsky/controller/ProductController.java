package com.travelsky.controller;

import com.travelsky.bean.Product;
import com.travelsky.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 16:37 2018/4/3
 * @Modified By:
 */
@RestController
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/product/add")
    public Integer addProduct(Product product){
        log.info("【添加商品】",product);
        return productService.addProduct(product);
    }
}
