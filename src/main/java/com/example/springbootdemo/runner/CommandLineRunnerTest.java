package com.example.springbootdemo.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author zhouwenjun
 * @version 2022/3/31
 */
@Slf4j
@Component
public class CommandLineRunnerTest implements CommandLineRunner {
  @Override
  public void run(String... args) throws Exception {
    log.info("CommandLineRunner test : {}", args);
  }
}
