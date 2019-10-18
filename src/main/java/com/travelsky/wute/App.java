package com.travelsky.wute;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.travelsky.controller.ConsumerController;
import com.travelsky.controller.ItemController;
import com.travelsky.mapper.ProductMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;
import redis.clients.jedis.Jedis;

import javax.sql.DataSource;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 15:21 2018/3/21
 * @Modified By:
 */
@SpringBootApplication(scanBasePackages = "com.travelsky",exclude = ErrorMvcAutoConfiguration.class)
@MapperScan(basePackages = "com.travelsky.mapper")
@EnableDubbo
//@EnableRedis
public class App  {
    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(App.class);
        ConfigurableApplicationContext context = app.run(args);
//        System.out.println(context.getBean(ProductMapper.class));
//        System.out.println(context.getBean(Runnable.class));
//        System.out.println(context.getBean(DataSource.class).getClass());
//        DataSource ds = context.getBean(DataSource.class);
//        System.out.println(ds.getConnection().getCatalog());
//        System.out.println(context.getBean(JdbcTemplate.class));
//        System.out.println(context.getBean(ItemController.class).getClass());
//        System.out.println(context.getBean(Jedis.class));
//        Jedis jedis = context.getBean(Jedis.class);
////        jedis.set("name","wute");
//        System.out.println(jedis.get("name"));
//        context.getBean(ItemController.class).log();
        System.out.println(context.getBean(ConsumerController.class).test());
    }
}



