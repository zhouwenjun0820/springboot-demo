package com.example.springbootdemo.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zhouwenjun
 * @version 2022/4/11
 */
@RestControllerAdvice
public class ExceptionAdvice {

  @ExceptionHandler(Exception.class)
  public BaseResult CustomException(Exception e) {
    BaseResult result = new BaseResult();
    result.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
    result.setMessage(e.getMessage());
    return result;
  }
}
