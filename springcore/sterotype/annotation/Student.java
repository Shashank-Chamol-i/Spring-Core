package com.springcore.sterotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student {
	@Value("Alex")
	private String studentName;
	@Value("North Mars")
	private String city;
	@Value("#{subject}")
	private List<String>subject;
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	

}
