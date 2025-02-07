package com.springcore.Anotation;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Main {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Anotation/annotation.xml");
	Syllabus syl = (Syllabus)context.getBean("anot");
	System.out.println(syl);
	context.registerShutdownHook();
	}
	
}
