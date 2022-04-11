package com.example.springbootdemo.pattern.abs.factory.demo.impl;

import com.example.springbootdemo.pattern.abs.factory.demo.Role;
import lombok.Data;

/**
 * @author zhouwenjun
 * @version 2022/3/28
 */
@Data
public class AdminRole implements Role {
  /**
   * 工号
   */
  private String workNo;

  /**
   * 管理的corp
   */
  private String corpNo;

  @Override
  public boolean canScore(Long docId) {
    // 查看docId是否是corpNo的
    return true;
  }
}
