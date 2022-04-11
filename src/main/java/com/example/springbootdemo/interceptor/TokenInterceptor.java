package com.example.springbootdemo.interceptor;

import com.example.springbootdemo.exception.TokenException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhouwenjun
 * @version 2022/4/11
 */
@Slf4j
public class TokenInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    String token = request.getHeader("token");
    if (token != null && !token.equals("123456")) {
      throw new TokenException();
    }
    return true;
  }
}
