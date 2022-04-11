package com.example.springbootdemo.pattern.abs.factory;

/**
 * @author zhouwenjun
 * @version 2022/3/28
 */
public class Test {
  public static void main(String[] args) {
    // 工厂是抽象的，有多种工厂的实现
    AbstractProductFactory factory = AbstractProductFactory.getFactory("low");
    // 产品是抽象的，有多种产品的实现，具体产品和具体工厂是对应的
    AbstractProduct product = factory.create();
    // 产品的使用是动态的
    System.out.println(product.getName());

    factory = AbstractProductFactory.getFactory("good");
    product = factory.create();
    System.out.println(product.getName());
  }
}
