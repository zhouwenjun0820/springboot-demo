package com.example.springbootdemo.advice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 返回结果统一处理
 */
@RestControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice<Object> {

  @Override
  public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> aClass) {
    // 如果接口返回的类型本身就是BaseResult那就没有必要进行额外的操作，返回false
    return !returnType.getGenericParameterType().equals(BaseResult.class);
  }

  @Override
  public Object beforeBodyWrite(Object data, MethodParameter returnType, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest request, ServerHttpResponse response) {
    // String类型不能直接包装，所以要进行些特别的处理
    if (returnType.getGenericParameterType().equals(String.class)) {
      ObjectMapper objectMapper = new ObjectMapper();
      try {
        // 将数据包装在BaseResult里后，再转换为json字符串响应给前端
        return objectMapper.writeValueAsString(new BaseResult(data));
      } catch (JsonProcessingException e) {
        throw new RuntimeException("返回String类型错误");
      }
    }
    // 将原本的数据包装在ResultVO里
    return new BaseResult(data);
  }
}