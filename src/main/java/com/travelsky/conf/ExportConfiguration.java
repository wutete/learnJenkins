package com.travelsky.conf;

import org.springframework.boot.actuate.autoconfigure.ExportMetricWriter;
import org.springframework.boot.actuate.metrics.jmx.JmxMetricWriter;
import org.springframework.boot.actuate.metrics.writer.MetricWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 17:17 2018/4/2
 * @Modified By:
 */
@Configuration
public class ExportConfiguration {

    @Bean
    @ExportMetricWriter
    public MetricWriter createMetricWriter(MBeanExporter mBeanExporter){
        return new JmxMetricWriter(mBeanExporter);
    }
}
