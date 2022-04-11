package com.example.springbootdemo.mode;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * @author zhouwenjun
 * @version 2022/3/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable<User> {

  private String name;
  private Integer age;

  @Override
  public int compareTo(User that) {
    return ComparisonChain.start().compare(this.name, that.name).compare(this.age, that.age).result();
  }

  public static void main(String[] args) {
    Ordering<String> lengthAscOrdering = new Ordering<String>() {
      @Override
      public int compare(@Nullable String s, @Nullable String t1) {
        return Ints.compare(s.length(), t1.length());
      }
    };
    lengthAscOrdering = lengthAscOrdering.nullsFirst().reverse();
    List<String> stringList = Lists.newArrayList(null, "333", "22", "1");
    stringList.sort(lengthAscOrdering);
    System.out.println(stringList);

    Ordering<User> userOrdering = Ordering.natural().nullsLast().onResultOf(User::getName);
    List<User> users = Lists.newArrayList();
    users.add(new User("b", 1));
    users.add(new User("a", 1));
    users.sort(userOrdering);
  }
}
