package com.springcore.lifecyclexml;

public class Samosa {
	private int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting Price....");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void init() {
		System.out.println("Inside the init Method : ");
	}
	public void destroy() {
		System.out.println("Inside the Destroy Method :");
	}
	
	

}
