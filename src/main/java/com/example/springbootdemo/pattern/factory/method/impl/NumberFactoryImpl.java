package com.example.springbootdemo.pattern.factory.method.impl;

import com.example.springbootdemo.pattern.factory.method.NumberFactory;

import java.math.BigDecimal;

/**
 * @author zhouwenjun
 * @version 2022/3/28
 */
public class NumberFactoryImpl implements NumberFactory {
  @Override
  public Number create(String s) {
    return new BigDecimal(s);
  }
}
