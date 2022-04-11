package com.example.springbootdemo.pattern.abs.factory;

import com.example.springbootdemo.pattern.abs.factory.impl.LowQualityProductFactory;
import com.example.springbootdemo.pattern.abs.factory.impl.GoodProductFactory;

/**
 * 抽象工厂类
 * @author zhouwenjun
 * @version 2022/3/28
 */
public interface AbstractProductFactory {
  /**
   * 生产实例
   */
  AbstractProduct create();

  /**
   * 动态返回工厂
   */
  static AbstractProductFactory getFactory(String type) {
    if (type.equalsIgnoreCase("low")) {
      return new LowQualityProductFactory();
    }
    return new GoodProductFactory();
  }
}
