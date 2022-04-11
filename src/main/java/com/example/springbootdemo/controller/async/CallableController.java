package com.example.springbootdemo.controller.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
@Slf4j
public class CallableController {

  @RequestMapping(value = "/test/callable")
  public Callable<String> testCallable() {
    log.info("外部线程: " + Thread.currentThread().getName());
    Callable<String> callable = () -> {
      log.info("异步线程开始执行. Thread: " + Thread.currentThread().getName());
      Thread.sleep(3000);
      log.info("异步线程执行结束");
      return "异步执行的执行结果";
    };
    log.info("外部线程 finished");
    return callable;
  }

}

