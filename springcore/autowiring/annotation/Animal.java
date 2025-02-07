package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Animal {
	@Autowired
	@Qualifier("elephant2")
	//AutoWired can be used above bean property
	private Elephant elephant;
	
	// AutoWired can be used above Setter 
	public void setelephant(Elephant elephant) {
		this.elephant = elephant;
	}
	public Elephant getelephant() {
		return this.elephant;
	}
	// AutoWired can be used above constructor
	public Animal() {
		super();
	}
	@Override
	public String toString() {
		return"Elephant :"+elephant;
	}
}
