package com.springcore.mapcollection;

import java.util.Map;

public class University {
	private Map<String,Double>course;
	
	public void setcourse(Map<String ,Double>course) {
		this.course = course;
	}
	
	public Map<String,Double> getcourse(){
		return course;
	}
	
	@Override
	public String toString() {
		return "Course details :"+course;
	}
}
