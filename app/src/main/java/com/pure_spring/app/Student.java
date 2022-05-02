package com.pure_spring.app;

public class Student implements Person {

  private String name;

  public Student(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void printName() {
    System.out.println(this.name);
  }
}
