package com.travelsky.service.ServiceImpl;

import com.travelsky.bean.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 17:09 2018/4/3
 * @Modified By:
 */
@SpringBootTest(classes = ProductServiceImpl.class)
@RunWith(SpringRunner.class)
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void addProduct() throws Exception {
        Product product = new Product();
        product.setPname("iphone x");
        product.setPrice(8888.00);
        product.setType("手机");
        product.setCreateTime(Timestamp.valueOf(LocalDateTime.now()));
        productService.addProduct(product);
    }

}