package com.example.springbootdemo.pattern.abs.factory.impl;

import com.example.springbootdemo.pattern.abs.factory.AbstractProduct;

/**
 * 高质量产品
 * @author zhouwenjun
 * @version 2022/3/28
 */
public class GoodProduct implements AbstractProduct {
  @Override
  public String getName() {
    return "高质量产品";
  }
}
