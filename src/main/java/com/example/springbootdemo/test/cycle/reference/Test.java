package com.example.springbootdemo.test.cycle.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhouwenjun
 * @version 2022/4/13
 */
public class Test {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/cycle.reference.xml");
    A a = (A)applicationContext.getBean("a");
    a.fun();

    ((B)applicationContext.getBean("b")).fun();
  }
}
