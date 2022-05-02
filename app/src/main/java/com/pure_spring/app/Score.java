package com.pure_spring.app;

public class Score {

  private String subject;
  private Integer points;

  public Score() {}

  public Score(String subject, Integer points) {
    this.subject = subject;
    this.points = points;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    // System.out.println("Score subject: " + subject);
    this.subject = subject;
  }

  public Integer getPoints() {
    return this.points;
  }

  public void setPoints(Integer points) {
    // System.out.println("Score points: " + points);
    this.points = points;
  }

  public Score subject(String subject) {
    setSubject(subject);
    return this;
  }

  public Score points(Integer points) {
    setPoints(points);
    return this;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " subject='" +
      getSubject() +
      "'" +
      ", points='" +
      getPoints() +
      "'" +
      "}"
    );
  }
}
