package com.pure_spring.app;

public class Student implements Person {

  private Long id;
  private String name;

  public Student() {} // create an instance ie. new Student()

  public Student(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void printName() {
    System.out.println("name is: " + this.name + " and id: " + this.id);
  }
}
