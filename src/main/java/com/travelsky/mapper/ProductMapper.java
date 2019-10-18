package com.travelsky.mapper;

import com.travelsky.bean.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 15:51 2018/4/3
 * @Modified By:
 */
public interface ProductMapper {
    public Integer addProduct(Product product);
}
