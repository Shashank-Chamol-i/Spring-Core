package com.springcore.autowiring.annotation;

public class Elephant {
	private String name;
	private int size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public Elephant() {
		super();
	}
	@Override
	public String toString() {
		return "Name :"+this.name+" Size :"+this.size;
	}
	
	
}
