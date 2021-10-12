package com.example.demo;

import org.springframework.stereotype.Component;

// ✨ This Laptop class act as dependency injection component for Alien class
// In other words the Alien class is dependent on Laptop class 
// ✨ where lap1 is the object name of Laptop class made inside spring container
@Component("lap1")
public class Laptop {
	private int lid;
	private String brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void compile() {
		System.out.println("message from laptop class 'AutoWired' ");
	}
}
