package com.example.springbootdemo.pattern.factory.method;

/**
 * 工厂方法可以隐藏创建产品的细节，而且不一定每次都会真正的创建产品，完全可以返回缓存中的产品，从而提升苏荷和减少内存消耗
 * @author zhouwenjun
 * @version 2022/3/28
 */
public class Test {
  public static void main(String[] args) {
    NumberFactory numberFactory = NumberFactory.getFactory();
    Number number = numberFactory.create("1");
    System.out.println(number);
  }
}
