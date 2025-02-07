package com.springcore.autowiring.constructor;

public class Human {
	private String species;
	private String name;
	
	public void setspecies(String species) {
		this.species = species;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String getname() {
		return this.name;
	}
	
	public String getspecies() {
		return this.species;
	}
	
	public Human() {
		super();
		System.out.println("Inside Human Constructor");
	}
	@Override
	public String toString() {
		return "Species : "+this.species+" Name :"+this.name;
	}
}
