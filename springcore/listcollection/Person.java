package com.springcore.listcollection;

import java.util.List;

public class Person {
	private List<String>assest;

	public List<String> getAssest() {
		return assest;
	}

	public void setAssest(List<String> assest) {
		this.assest = assest;
	}

	@Override
	public String toString() {
		return "Person [assest=" + assest + "]";
	}
	
	

}
