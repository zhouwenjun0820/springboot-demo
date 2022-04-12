package com.example.springbootdemo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouwenjun
 * @version 2022/4/12
 */
@Configuration
public class BeanInstanceTestConfig {
  @Bean(name = "beanInstanceTest", initMethod = "initMethod")
  public BeanInstanceTest beanInitialTest() {
    return new BeanInstanceTest();
  }
}
