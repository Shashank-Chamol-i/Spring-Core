package com.springcore.autowiring.bytype;

public class Animal {
	private Cat cat;
	
	public void setcat(Cat cat) {
		this.cat = cat;
		System.out.println("Inside Cat setter method");
	}
	public Cat getcat() {
		return this.cat;
	}
	public Animal() {
		super();
		
		System.out.println("Inside Cat Constructor:");
	}
	@Override
	public String toString() {
		return "Cat :"+this.cat;
	}
}
