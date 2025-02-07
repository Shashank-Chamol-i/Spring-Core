package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/constructorConfig.xml");
		Person per = (Person)context.getBean("person");
		System.out.println(per);
		 Person per1 = (Person)context.getBean("person1");
		 System.out.println(per1);
		
	}

}
