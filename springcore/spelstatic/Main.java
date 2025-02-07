package com.springcore.spelstatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spelstatic/house.xml");
		House house = context.getBean("house",House.class);
		System.out.println(house);
	}

}
