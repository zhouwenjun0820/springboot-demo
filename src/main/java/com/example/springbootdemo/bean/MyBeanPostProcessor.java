package com.example.springbootdemo.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author zhouwenjun
 * @version 2022/4/12
 */
@Slf4j
@Component
public class MyBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

  private boolean matchBean(String beanName) {
    return beanName.equalsIgnoreCase("beanInstanceTest");
  }

  @Override
  public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
    if (matchBean(beanName)) {
      log.info("BeanInitialTest postProcessBeforeInstantiation");
    }
    return null;
  }

  @Override
  public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
    if (matchBean(beanName)) {
      log.info("BeanInitialTest postProcessAfterInstantiation");
    }
    return false;
  }

  @Override
  public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
    if (matchBean(beanName)) {
      log.info("BeanInitialTest postProcessProperties");
    }
    return null;
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    if (matchBean(beanName)) {
      log.info("BeanInitialTest postProcessBeforeInitialization");
    }
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if (matchBean(beanName)) {
      log.info("BeanInitialTest postProcessAfterInitialization");
    }
    return bean;
  }
}
