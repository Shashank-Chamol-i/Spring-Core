package com.springcore.autowiring.byname;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/byname/byname.xml");
		Animal animal = context.getBean("animal",Animal.class);
		System.out.println(animal);
	}

}
