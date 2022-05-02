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

    Person student2 = appContext.getBean("person", Person.class);
    student2.printName();

    Student student3 = appContext.getBean("student", Student.class);
    student3.printName();
  }
}
