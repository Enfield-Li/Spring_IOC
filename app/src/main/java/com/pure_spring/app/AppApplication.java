package com.pure_spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AppApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext configContext = SpringApplication.run(
      AppApplication.class,
      args
    );

    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
      "bean.xml"
    );

    Person student = appContext.getBean("person", Person.class);

    student.printName();
  }
}
