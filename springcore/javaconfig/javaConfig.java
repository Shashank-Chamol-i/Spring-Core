package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class javaConfig {
	
	// While Using Bean Component we do not require @ComponentScan
	@Bean
	public Teacher status() {
		Teacher teacher = new Teacher(state());
		return teacher;
	}
	
	@Bean(name = {"state","anyone"})
	public Principal state() {
		return new Principal();
	}

}
