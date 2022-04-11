package com.example.springbootdemo.pattern.abs.factory.demo;

/**
 * @author zhouwenjun
 * @version 2022/3/28
 */
public class Test {
  public static void main(String[] args) {
    RoleFactory roleFactory = RoleFactory.getFactory("admin");
    Role role = roleFactory.create("workNo");
    role.canScore(1L);
  }
}
