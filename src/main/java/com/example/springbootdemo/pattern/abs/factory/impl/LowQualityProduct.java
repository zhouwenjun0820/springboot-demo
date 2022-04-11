package com.example.springbootdemo.pattern.abs.factory.impl;

import com.example.springbootdemo.pattern.abs.factory.AbstractProduct;

/**
 * 低质量产品
 * @author zhouwenjun
 * @version 2022/3/28
 */
public class LowQualityProduct implements AbstractProduct {
  @Override
  public String getName() {
    return "低质量的产品";
  }
}
