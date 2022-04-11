package com.example.springbootdemo.pattern.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

/**
 * @author zhouwenjun
 * @version 2022/3/29
 */
public class Test {
  public static void main(String[] args) throws Exception {
    // 创建原始的数据源:
    InputStream fis = new FileInputStream("./src/main/resources/static/test.txt.gz");
    // 增加缓冲功能:
    InputStream bis = new BufferedInputStream(fis);
    // 增加解压缩功能:
    InputStream gis = new GZIPInputStream(bis);

    InputStreamReader reader = new InputStreamReader(gis);
    BufferedReader in = new BufferedReader(reader);
    String readed;
    while ((readed = in.readLine()) != null) {
      System.out.println(readed);
    }
  }
}
