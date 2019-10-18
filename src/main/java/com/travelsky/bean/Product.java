package com.travelsky.bean;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 15:46 2018/4/3
 * @Modified By:
 */
@Data
public class Product {
    private Integer pid;
    private String pname;
    private String type;
    private Double price;
    private Timestamp createTime;
}
