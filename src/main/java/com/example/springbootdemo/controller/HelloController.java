package com.example.springbootdemo.controller;

import com.example.springbootdemo.beanfactory.TestHandler;
import com.example.springbootdemo.task.AsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

  @RequestMapping("/test/error")
  public Object error(){
    return 1/0;
  }

  @Autowired
  AsyncTask asyncTask;

  @RequestMapping("/test/hello")
  public String hello(){
    long start = System.currentTimeMillis();
    asyncTask.task1();
    asyncTask.task2();
    log.info("testAsyncTask all cost {}", System.currentTimeMillis() - start);
    return "hello";
  }

  @Autowired
  private TestHandler testHandler;

  @RequestMapping("/test/beanDefinitionRegistryPostProcesser")
  public void handler(){
    testHandler.handle();
  }
}

