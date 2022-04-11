package com.example.springbootdemo.advice;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
public class BaseResult<T> {

  /**
   * 请求状态
   */
  private HttpStatus httpStatus;

  /**
   * 返回数据
   */
  private T data;

  /**
   * 额外数据
   */
  private Object extraData;

  /**
   * 提示信息
   */
  private String message;

  public BaseResult(T data) {
    this.data = data;
    httpStatus = HttpStatus.OK;
    message = "success" ;
  }

}
