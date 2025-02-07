package com.springcore.spelstatic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class House {
	@Value("#{new java.lang.String('Red')}")
	private String color;
	@Value("#{T(java.lang.Math).sqrt(1024)}")
	private double surface;
	@Value("#{T(java.lang.Math).E}")
	private double E;
	@Value("#{15>14}")
	private boolean isActive;
	@Value("#{false}")
	private boolean status;
	@Value("#{new java.util.Date().toString()}")
	private String currentDate;
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}
	public double getE() {
		return E;
	}
	public void setE(double e) {
		E = e;
	}
	@Override
	public String toString() {
		return "House [color=" + color + ", surface=" + surface + ", E=" + E + ", isActive=" + isActive + ", status="
				+ status + ", currentDate=" + currentDate + "]";
	}
	
	
	
	

}
