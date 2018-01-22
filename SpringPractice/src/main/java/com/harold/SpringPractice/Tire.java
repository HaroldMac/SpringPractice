package com.harold.SpringPractice;

import org.springframework.stereotype.Component;

@Component
public class Tire {
	

	private String brand;

	@Override
	public String toString() {
		return "Tire!";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	

}
