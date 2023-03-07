package com.strands.interviews.task4;

public final class Singleton {
	
	private static Singleton instance;
	public String anyProperty;
	
	private Singleton(String anyProperty) {
		this.anyProperty = anyProperty;
	}
	
	public static Singleton getInstance(String anyProperty) {
		if(instance == null) {
			return new Singleton(anyProperty);
		}else {
			return instance;
		}
	}

	public String getAnyProperty() {
		return anyProperty;
	}

	public void setAnyProperty(String anyProperty) {
		this.anyProperty = anyProperty;
	}
	
	
}
