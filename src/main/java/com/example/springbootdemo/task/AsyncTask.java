package com.example.springbootdemo.task;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author zhouwenjun
 * @version 2022/4/11
 */
@Component
@Slf4j
public class AsyncTask {

  @Async
  @SneakyThrows
  public void task1() {
    long start = System.currentTimeMillis();
    Thread.sleep(3000);
    log.info("task1 cost {}", System.currentTimeMillis() - start);
  }

  @Async
  @SneakyThrows
  public void task2() {
    long start = System.currentTimeMillis();
    Thread.sleep(3000);
    log.info("task2 cost {}", System.currentTimeMillis() - start);
  }
}
