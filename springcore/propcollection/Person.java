package com.springcore.propcollection;

import java.util.Properties;

public class Person {
	private Properties properties;
	
	public void setproperties(Properties properties) {
		this.properties = properties;
	}
	public Properties getproperties() {
		return properties;
	}
	@Override
	public String toString() {
		return "Properties are : "+properties;
	}

}
