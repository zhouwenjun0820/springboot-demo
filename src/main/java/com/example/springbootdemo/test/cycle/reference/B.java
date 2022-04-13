package com.example.springbootdemo.test.cycle.reference;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhouwenjun
 * @version 2022/4/13
 */
@Slf4j
@Setter
@Getter
public class B {
  A a;

  public void fun() {
    log.info("B fun");
  }
}
