package com.travelsky.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 15:29 2018/3/21
 * @Modified By:
 */
@Configuration
public class RunnableConfiguration {

    @Bean
    public Runnable createRunnable(){
        return () -> {};
    }
}
