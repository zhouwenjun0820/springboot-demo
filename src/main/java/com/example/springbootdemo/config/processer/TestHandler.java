package com.example.springbootdemo.config.processer;

/**
 * @author zhouwenjun
 * @version 2022/4/12
 */
@Handler(code = "testHandler")
public class TestHandler {
  public void handle(){
    System.out.println("handle invoked!");
  }
}
