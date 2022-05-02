package com.pure_spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AppApplication {

  public static void main(String[] args) {
    // ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
    //   "bean.xml"
    // );
    // School school = appContext.getBean("school", School.class);
    // System.out.println("xml: " + school);

    ConfigurableApplicationContext configContext = SpringApplication.run(
      AppApplication.class,
      args
    );

    School school = configContext.getBean("school", School.class);
    school.test();
  }
}
