package com.example.springbootdemo.pattern.abs.factory.demo.impl;

import com.example.springbootdemo.pattern.abs.factory.demo.Role;
import lombok.Data;

/**
 * @author zhouwenjun
 * @version 2022/3/28
 */
@Data
public class ManagerRole implements Role {

  /**
   * 工号
   */
  private String workNo;

  /**
   * 汇报线
   */
  private String reportPath;

  @Override
  public boolean canScore(Long docId) {
    // 查看docId的员工汇报给当前主管
    return true;
  }
}
