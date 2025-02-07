package com.springcore.sterotype.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/annotation/stero.xml");
		Student student = context.getBean("obj",Student.class);
		System.out.println(student);
		System.out.println(student.getSubject());

	}

}
