package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		Student student = context.getBean("student",Student.class);
		Teacher teacher = context.getBean("status",Teacher.class);
		teacher.status();
		student.status();
	}

}
