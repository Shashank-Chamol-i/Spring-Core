package com.springcore.autowiring.bytype;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/bytype/bytype.xml");
		Animal animal = context.getBean("animal",Animal.class);
		System.out.println(animal);
	}

}
