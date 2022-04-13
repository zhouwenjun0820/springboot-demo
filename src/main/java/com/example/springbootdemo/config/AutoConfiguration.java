package com.example.springbootdemo.config;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhouwenjun
 * @version 2022/4/13
 */
@Slf4j
public class AutoConfiguration {
  public AutoConfiguration() {
    log.info("AutoConfiguration自动加载");
  }
}
