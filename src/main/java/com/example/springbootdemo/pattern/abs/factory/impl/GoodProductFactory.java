package com.example.springbootdemo.pattern.abs.factory.impl;

import com.example.springbootdemo.pattern.abs.factory.AbstractProduct;
import com.example.springbootdemo.pattern.abs.factory.AbstractProductFactory;

/**
 * 高质量产品的工厂
 * @author zhouwenjun
 * @version 2022/3/28
 */
public class GoodProductFactory implements AbstractProductFactory {
  @Override
  public AbstractProduct create() {
    return new GoodProduct();
  }
}
