package com.travelsky.service.ServiceImpl;

import com.travelsky.bean.Product;
import com.travelsky.mapper.ProductMapper;
import com.travelsky.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 16:05 2018/4/3
 * @Modified By:
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
   private ProductMapper productMapper;

    public Integer addProduct(Product product) {

        return productMapper.addProduct(product);
    }
}
