package com.springcore.propcollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/propcollection/prop.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
	}

}
