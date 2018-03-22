package com.codenotfound.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codenotfound.services.helloworld.HelloWorldPortType;
import com.informatica.wsh.DataIntegrationService;

@Configuration
public class ClientConfig {

  @Value("${client.ticketagent.address}")
  private String address;
  

  @Value("${client1.ticketagent1.addressinformatica}")
  private String addressinformatica;
  
  @Bean(name = "helloWorldProxy")
  public HelloWorldPortType helloWorldProxy() {
    JaxWsProxyFactoryBean jaxWsProxyFactoryBean =
        new JaxWsProxyFactoryBean();
    jaxWsProxyFactoryBean.setServiceClass(HelloWorldPortType.class);
    jaxWsProxyFactoryBean.setAddress(address);

    return (HelloWorldPortType) jaxWsProxyFactoryBean.create();
  }
  
  /**
   * DataIntegrationService
   * @return
   */

  @Bean(name = "dataIntegrationServiceProxy")
  public DataIntegrationService   dataIntegrationServiceProxy() {
    JaxWsProxyFactoryBean jaxWsProxyFactoryBean =
        new JaxWsProxyFactoryBean();
    jaxWsProxyFactoryBean.setServiceClass(DataIntegrationService.class);
    jaxWsProxyFactoryBean.setAddress(addressinformatica);

    return (DataIntegrationService) jaxWsProxyFactoryBean.create();
 }
}
