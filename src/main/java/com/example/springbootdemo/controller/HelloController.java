package com.example.springbootdemo.controller;

import com.example.springbootdemo.task.AsyncTask;
import com.google.common.collect.Lists;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
@Slf4j
public class HelloController {
  @RequestMapping("/helloAop")
  public Object hello(){
    Lists.newArrayList();
    return "hello aop";
  }

  @RequestMapping("/helloError")
  public Object helloError(){
    return 1/0;
  }

  /**
   * 异步处理测试
   */
  @RequestMapping(value = "/testAsyncThread")
  public Callable<String> testAsync() {
    log.info("controller#handler called. Thread: " + Thread.currentThread().getName());
    Callable<String> callable = () -> {
      log.info("controller-callable#async task started. Thread: " + Thread.currentThread().getName());
      Thread.sleep(3000);
      log.info("controller-callable#async task finished");
      return "async result";
    };
    log.info("controller#handler finished");
    return callable;
  }

  @Autowired
  AsyncTask asyncTask;

  @RequestMapping("/testAsyncTask")
  @SneakyThrows
  public Object testAsyncTask(){
    long start = System.currentTimeMillis();
    asyncTask.task1();
    asyncTask.task2();
    log.info("testAsyncTask all cost {}", System.currentTimeMillis() - start);
    return null;
  }
}

