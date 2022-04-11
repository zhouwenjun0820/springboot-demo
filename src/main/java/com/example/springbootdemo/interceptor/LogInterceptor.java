package com.example.springbootdemo.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhouwenjun
 * @version 2022/4/11
 */
@Slf4j
public class LogInterceptor implements AsyncHandlerInterceptor {

  private static final String ATTRIBUTE_START_TIME = "startTime";

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    if (request.getAttribute(ATTRIBUTE_START_TIME) == null) {
      request.setAttribute(ATTRIBUTE_START_TIME, System.currentTimeMillis());
    }
    log.info("preHandle receive new request : {}", request.getRequestURI());
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    Long cost = System.currentTimeMillis() - (Long)request.getAttribute(ATTRIBUTE_START_TIME);
    log.info("postHandle deal request {} cost {}ms", request.getRequestURI(), cost);
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    log.info("afterCompletion enter : {}", request.getRequestURI());
  }

  @Override
  public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    log.info("afterConcurrentHandlingStarted enter : {}", request.getRequestURI());
  }
}
