package com.pure_spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan(basePackages = "com.pure_spring.app.School")
public class SchoolConfig {

  @Bean(name = "mathTeacher")
  public Teacher mathTeacherBean() {
    return new MathTeacher();
  }

  @Bean(name = "principal")
  public Principal principalBean() {
    Principal principal = new Principal();
    return principal;
  }

  @Bean(name = "school")
  public School schoolBean() { // bean id
    // consturctor injection
    // School school = new School(principalBean());

    // setter injection
    School school = new School();
    school.setPrincipal(principalBean());
    school.setTeacher(mathTeacherBean());
    return school;
  }
}
