package com.Aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Aop.services.Student;

@Configuration
@ComponentScan(basePackages = "com.Aop")
public class ConfigFile {

}
