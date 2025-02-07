package com.springcore.lifeInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifeInterface/interface.xml");
		Pepsi p = (Pepsi)context.getBean("p1");
		System.out.println(p);
		context.registerShutdownHook();
	}

}
