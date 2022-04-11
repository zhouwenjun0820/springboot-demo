package com.example.springbootdemo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;
import org.junit.jupiter.api.Test;


/**
 * @author zhouwenjun
 * @version 2022/3/29
 */
public class JsonTest {

  @Test
  public static void main(String[] args) {
    ClassA classA = new ClassA();
    Address address = new Address();
    address.setAddress("aaaa");
    ClassB<Address> classB = new ClassB<>();
    classB.setName("xxx");
    classB.setAddress(address);
    classA.setBase(classB);

    String jsonStr = JSON.toJSONString(classA);
    System.out.println(jsonStr);
    ClassA copy = JSON.parseObject(jsonStr, ClassA.class);
    // 丢失信息： {"base":{"name":"xxx"}}
    System.out.println(JSON.toJSONString(copy));

    String jsonStrWithClass = JSON.toJSONString(classA, SerializerFeature.WriteClassName);
    System.out.println(jsonStrWithClass);
    // 开启泛型自动转换
    ParserConfig.getGlobalInstance().addAccept("com.example.springbootdemo");
    ClassA rightCopy = JSON.parseObject(jsonStrWithClass, ClassA.class);
    // {"base":{"address":"yyy","name":"xxx"}}
    System.out.println(JSON.toJSONString(rightCopy));

  }

  @Data
  static class ClassA {
    Base base;
  }

  @Data
  static class Base {
    String name;
  }

  @Data
  static class ClassB <T> extends Base {
    T address;
  }

  @Data
  static class Address {
    String address;
  }
}
