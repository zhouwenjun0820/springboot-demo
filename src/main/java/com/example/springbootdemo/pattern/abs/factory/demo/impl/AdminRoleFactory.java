package com.example.springbootdemo.pattern.abs.factory.demo.impl;

import com.example.springbootdemo.pattern.abs.factory.demo.Role;
import com.example.springbootdemo.pattern.abs.factory.demo.RoleFactory;

/**
 * @author zhouwenjun
 * @version 2022/3/28
 */
public class AdminRoleFactory implements RoleFactory {
  @Override
  public Role create(String workNo) {
    AdminRole role = new AdminRole();
    role.setWorkNo(workNo);
    // 从acl查询管理的corp
    role.setCorpNo("");
    return role;
  }
}
