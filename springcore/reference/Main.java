package com.springcore.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/referencesConfig.xml");
		A temp = (A)context.getBean("aref");
		System.out.println(temp.getX());
		
		System.out.println(temp.getObj().getY());
		System.out.println(temp);
	}

}
