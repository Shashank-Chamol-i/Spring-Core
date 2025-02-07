package com.springcore.autowiring.byname;

public class Dog {
	private String breed;
	private String sound;
	
	public void setbreed(String breed) {
		this.breed = breed;
	}
	public String getbreed() {
		return this.breed;
	}
	public void setsound(String sound) {
		this.sound = sound;
	}
	public String getsound() {
		return this.sound;
	}
	public Dog() {
		super();
	}
	@Override
	public String toString() {
		return "Dog Breed "+this.breed+"  Sound "+this.sound ;
	}
}
