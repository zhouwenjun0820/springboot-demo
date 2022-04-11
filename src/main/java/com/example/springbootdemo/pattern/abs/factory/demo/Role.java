package com.example.springbootdemo.pattern.abs.factory.demo;

/**
 * 角色
 * @author zhouwenjun
 * @version 2022/3/28
 */
public interface Role {

  /**
   * 是否可以打分
   */
  boolean canScore(Long docId);
}
