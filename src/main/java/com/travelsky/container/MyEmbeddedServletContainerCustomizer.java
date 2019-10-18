package com.travelsky.container;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.valves.AccessLogValve;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: wutete
 * @Description:
 * @Date: Created in 16:48 2018/3/26
 * @Modified By:
 */
@Component
public class MyEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {

    public void customize(ConfigurableEmbeddedServletContainer container) {
        TomcatEmbeddedServletContainerFactory containerFactory =(TomcatEmbeddedServletContainerFactory)container;
        containerFactory.setPort(8989);
        containerFactory.addContextValves(getAccessLogValue());

        containerFactory.addConnectorCustomizers(new MyConnectorCustomizers());
    }

    private AccessLogValve getAccessLogValue(){
        AccessLogValve logValve = new AccessLogValve();
        logValve.setDirectory("e:/temp/tomcat");
        logValve.setEnabled(true);
        logValve.setPrefix("springboot-acceslog");
        logValve.setSuffix(".txt");
        logValve.setPattern("combined");
        return logValve;
    }
}

class  MyConnectorCustomizers implements TomcatConnectorCustomizer{

    public void customize(Connector connector) {
        Http11NioProtocol protocol =(Http11NioProtocol)connector.getProtocolHandler();
        protocol.setMaxConnections(2000);
        protocol.setMaxThreads(500);
    }
}
