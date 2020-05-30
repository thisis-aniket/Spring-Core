package com.annotation.AnnotationConfig;

public class Tyre {
	//Constructor Injection...
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}
	//Bean Property Example...
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Its working...";
	}

	
	

}
