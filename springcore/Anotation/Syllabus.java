package com.springcore.Anotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Syllabus {
	private String subject;
	
	public void setsubject(String subject) {
		this.subject = subject;
	}
	public String getsubject() {
		return this.subject;
	}
	public Syllabus() {
		super();
	}
	@Override
	public String toString() {
		return"Subject["+this.subject+"]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Init-Method Calling");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy-Method Calling");
	}
	

}
