package com.springcore.autowiring.bytype;

public class Cat {
	private String name;
	private String color;
	
	public void setname(String name) {
		this.name = name;
		System.out.println("Setting name using setter method");
	}
	public void setcolor(String color) {
		this.color = color;
		System.out.println("Setting color using setter method");
	}
	public String getname() {
		return this.name;
	}
	public String getcolor() {
		return this.color;
	}
	
	public Cat() {
		super();
	}
	@Override
	public String toString() {
		return "Name : "+this.name +"  Color : "+this.color;
	}
}
