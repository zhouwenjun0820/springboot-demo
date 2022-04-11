package com.example.springbootdemo.pattern.abs.factory.impl;

import com.example.springbootdemo.pattern.abs.factory.AbstractProduct;
import com.example.springbootdemo.pattern.abs.factory.AbstractProductFactory;

/**
 * 低质量的产品的工厂
 * @author zhouwenjun
 * @version 2022/3/28
 */
public class LowQualityProductFactory implements AbstractProductFactory {
  @Override
  public AbstractProduct create() {
    return new LowQualityProduct();
  }
}
