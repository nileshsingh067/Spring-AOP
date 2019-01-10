package com.nilesh.aop.components;

import org.springframework.stereotype.Component;

@Component("lap067")
public class Laptop {

	
	private int lid;
	private String price;
	
	public void compile() {
		System.out.println("Compiling....");
	}
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", price=" + price + "]";
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
