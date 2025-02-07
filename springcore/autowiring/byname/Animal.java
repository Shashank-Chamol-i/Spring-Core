package com.springcore.autowiring.byname;

public class Animal {
	private Dog dog;
	public void setdog(Dog dog) {
		System.out.println("********");
		this.dog = dog;
	}
	public Dog getdog() {
		return this.dog;
	}
	public Animal() {
		super();
	}
	@Override
	public String toString() {
		return "Animal [dog=" + dog + "]";
	}
	
}
