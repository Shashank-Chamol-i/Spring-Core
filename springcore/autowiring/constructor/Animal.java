package com.springcore.autowiring.constructor;

public class Animal {
	private Human human;
	
	public void sethuman(Human human) {
		this.human = human;
	}
	
	public Human gethuman() {
		return human;
	}
	
	public Animal(Human human) {
		super();
		this.human = human;
		System.out.println("Inside Animal Constructor");
	}
	@Override
	public String toString() {
		return "Human :"+human;
	}
}
