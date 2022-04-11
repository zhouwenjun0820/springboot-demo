package com.example.springbootdemo.pattern.abs.factory.demo.impl;

import com.example.springbootdemo.pattern.abs.factory.demo.Role;
import com.example.springbootdemo.pattern.abs.factory.demo.RoleFactory;

/**
 * @author zhouwenjun
 * @version 2022/3/28
 */
public class ManagerRoleFactory implements RoleFactory {
  @Override
  public Role create(String workNo) {
    ManagerRole role = new ManagerRole();
    role.setWorkNo(workNo);
    // 从数据库查询汇报线
    role.setReportPath("1/2/3/4/" + workNo);
    return role;
  }
}
