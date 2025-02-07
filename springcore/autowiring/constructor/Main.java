package com.springcore.autowiring.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/constructor/constructor.xml");
		Animal animal = context.getBean("animal",Animal.class);
		System.out.println(animal);
	}

}
