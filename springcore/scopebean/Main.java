package com.springcore.scopebean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/scopebean/scopebean.xml");
		Student student = context.getBean("student",Student.class);
		Student student2 = context.getBean("student",Student.class);
		System.out.println("Scope - Prototype-"+student.hashCode());
		System.out.println("Scope - Prototype-"+student2.hashCode());
		System.out.println("-------------------------------------------------------------");
		Student student3 = context.getBean("mybean",Student.class);
		Student student4 = context.getBean("mybean",Student.class);
		System.out.println("Scope - Singleton-"+student3.hashCode());
		System.out.println("Scope - Singleton-"+student4.hashCode());
		
	}

}
