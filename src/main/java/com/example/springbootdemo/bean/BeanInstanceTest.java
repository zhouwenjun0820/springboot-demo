package com.example.springbootdemo.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * @author zhouwenjun
 * @version 2022/4/12
 */
@Slf4j
public class BeanInstanceTest implements InitializingBean {

  @PostConstruct
  public void postConstruct() {
    log.info("BeanInitialTest postConstruct");
  }

  @Override
  public void afterPropertiesSet() {
    log.info("BeanInitialTest afterPropertiesSet");
  }

  public void initMethod() {
    log.info("BeanInitialTest initMethod");
  }
}
