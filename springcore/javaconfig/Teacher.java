package com.springcore.javaconfig;

public class Teacher {
	private Principal principal;
	
	public void status() {
		System.out.println("Teacher is teaching....");
		this.principal.status();
		
	}

	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public Teacher(Principal principal) {
		super();
		this.principal = principal;
	}

	
	

}
