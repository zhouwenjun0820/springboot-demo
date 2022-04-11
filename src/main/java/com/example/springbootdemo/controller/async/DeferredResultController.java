package com.example.springbootdemo.controller.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class DeferredResultController {

  private final List<DeferredResult<String>> deferredResultList = new ArrayList<>();

  @ResponseBody
  @GetMapping("/test/getDeferredResult")
  public DeferredResult<String> getDeferredResult() {
    DeferredResult<String> deferredResult = new DeferredResult<>();
    //先存起来，等待触发
    deferredResultList.add(deferredResult);
    return deferredResult;
  }

  @ResponseBody
  @GetMapping("/test/setResult")
  public void setResult() {
    // 让所有hold住的请求给与响应
    deferredResultList.forEach(d -> d.setResult("say hello to all"));
  }
}



