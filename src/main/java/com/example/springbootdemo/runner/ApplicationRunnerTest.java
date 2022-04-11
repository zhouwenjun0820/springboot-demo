package com.example.springbootdemo.runner;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author zhouwenjun
 * @version 2022/3/31
 */
@Slf4j
@Component
public class ApplicationRunnerTest implements ApplicationRunner {
  @Override
  public void run(ApplicationArguments args) throws Exception {
    log.info("ApplicationRunner test : {}", JSON.toJSONString(args));
  }
}
