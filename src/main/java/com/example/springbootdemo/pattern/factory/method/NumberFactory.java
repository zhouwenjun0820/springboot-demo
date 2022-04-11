package com.example.springbootdemo.pattern.factory.method;

import com.example.springbootdemo.pattern.factory.method.impl.NumberFactoryImpl;

/**
 * @author zhouwenjun
 * @version 2022/3/28
 */
public interface NumberFactory {
  /**
   * 实例创建方法
   */
  Number create(String s);

  NumberFactoryImpl IMPL = new NumberFactoryImpl();

  /**
   * 或者工厂实例
   */
  static NumberFactory getFactory() {
    return IMPL;
  }
}
