package com.example.springbootdemo.config.processer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

/**
 * 处理器扫描注册实现类
 * @author zhouwenjun
 * @version 2022/4/12
 */
@Component
public class HandlerBeanDefinitionRegistryPostProcess implements BeanDefinitionRegistryPostProcessor {
  @Override
  public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
    ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry);
    scanner.addIncludeFilter(new AnnotationTypeFilter(Handler.class));
    scanner.scan("com.example");
  }

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

  }
}
