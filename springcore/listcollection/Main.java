package com.springcore.listcollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("com/springcore/listcollection/list.xml");
		Person person = context.getBean("assest",Person.class);
		System.out.println(person);
		System.out.println(person.getAssest().getClass().getName());
	}

}
