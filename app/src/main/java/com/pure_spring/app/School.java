package com.pure_spring.app;

import org.springframework.stereotype.Component;

public class School {

  private Principal pricipal;
  private Teacher teacher;

  // constructor injection
  // public School(Principal principal) {
  //   this.pricipal = principal;
  // }

  public void setPrincipal(Principal principal) {
    System.out.println("setter principal");
    this.pricipal = principal;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public void test() {
    pricipal.pricipalInfo();
    teacher.teach();
    System.out.println("test here...");
  }
}
