package com.pure_spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolConfig {

  @Bean
  public School schoolBean() { // bean id
    School school = new School();
    return school;
  }
}
