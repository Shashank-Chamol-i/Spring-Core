package com.springcore.lifeInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return this.price;
	}
	public Pepsi() {
		super();
	}
	@Override
	public String toString() {
		return "Pepsi["+this.price+"]";
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside the Destroy-Method");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside the init-Method");
		// TODO Auto-generated method stub
		
	}
	
	
	

}
