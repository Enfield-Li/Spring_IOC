package com.pure_spring.app;

import java.util.Objects;

public class Student implements Person {

  private String name;

  private Score mathScore;

  public Student() {}

  public Student(String name, Score mathScore) {
    this.name = name;
    this.mathScore = mathScore;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    System.out.println("Student name: " + name);
    this.name = name;
  }

  public Score getMathScore() {
    return this.mathScore;
  }

  public void setMathScore(Score mathScore) {
    System.out.println("Student math score: " + mathScore);
    this.mathScore = mathScore;
  }

  public Student name(String name) {
    setName(name);
    return this;
  }

  public Student mathScore(Score mathScore) {
    setMathScore(mathScore);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Student)) {
      return false;
    }
    Student student = (Student) o;
    return (
      Objects.equals(name, student.name) &&
      Objects.equals(mathScore, student.mathScore)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mathScore);
  }

  @Override
  public String toString() {
    return (
      "{" +
      " name='" +
      getName() +
      "'" +
      ", mathScore='" +
      getMathScore() +
      "'" +
      "}"
    );
  }

  @Override
  public void printInfo() {
    System.out.println("name is: " + this.name);
  }

  public void printScore() {
    System.out.println(
      "Subject is: " +
      this.mathScore.getSubject() +
      " and scoring: " +
      this.mathScore.getPoints()
    );
  }
}
