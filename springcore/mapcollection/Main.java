package com.springcore.mapcollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
	public static void main(String[] args) {
	 AbstractApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/mapcollection/map.xml");
	 University uni = context.getBean("course",University.class);
	 System.out.println(uni);
	 System.out.println(uni.getcourse().getClass().getName());
	}

}
