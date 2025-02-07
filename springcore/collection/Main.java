package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionConfig.xml");
		Employee emp = (Employee) context.getBean("employee");
		Employee emp1 = (Employee)context.getBean("employee1");
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpPhoneNo());
		System.out.println(emp.getEmpAddress());
		System.out.println(emp.getEmpCourses());
		System.out.println(emp.getProp());
		
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpPhoneNo());
		System.out.println(emp1.getEmpAddress());
		System.out.println(emp1.getEmpCourses());
		System.out.println(emp1.getProp());
		

	}

}
