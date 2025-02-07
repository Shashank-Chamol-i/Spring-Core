package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String empName;
	private List<String> empPhoneNo;
	private Set <String> empAddress;
	private Map<String ,String> empCourses;
	private Properties prop;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpPhoneNo() {
		return empPhoneNo;
	}
	public void setEmpPhoneNo(List<String> empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}
	public Set<String> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}
	public Map<String, String> getEmpCourses() {
		return empCourses;
	}
	public void setEmpCourses(Map<String, String> empCourses) {
		this.empCourses = empCourses;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Employee(String empName, List<String> empPhoneNo, Set<String> empAddress, Map<String, String> empCourses,
			Properties prop) {
		super();
		this.empName = empName;
		this.empPhoneNo = empPhoneNo;
		this.empAddress = empAddress;
		this.empCourses = empCourses;
		this.prop = prop;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
