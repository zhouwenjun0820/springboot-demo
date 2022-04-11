package com.example.springbootdemo.pattern.abs.factory.demo;

import com.example.springbootdemo.pattern.abs.factory.demo.impl.AdminRole;
import com.example.springbootdemo.pattern.abs.factory.demo.impl.AdminRoleFactory;
import com.example.springbootdemo.pattern.abs.factory.demo.impl.ManagerRoleFactory;

/**
 * @author zhouwenjun
 * @version 2022/3/28
 */
public interface RoleFactory {
  Role create(String workNo);

  public static RoleFactory getFactory(String roleName) {
    if ("admin".equalsIgnoreCase(roleName)) {
      return new AdminRoleFactory();
    } else {
      return new ManagerRoleFactory();
    }
  }
}
