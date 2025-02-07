package com.springcore.constructorAmb;

public class Person {
	private String name;
	private int id;
	
	public Person(String name,int id) {
		this.name = name;
		this.id = id;
		System.out.println("Calling Constructor 1 ");
	}
	public Person(int id,String name) {
		this.id = id;
		this.name = name;
		System.out.println("Calling Constructor 2");
	}
	@Override
	public String toString() {
		return "Perosn[id = "+ this.id+" Name : "+this.name +" ]";
	}

}
