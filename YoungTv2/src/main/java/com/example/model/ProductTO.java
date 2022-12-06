package com.example.model;

public class ProductTO {

	private String name;
	private double price;
	
	// 디폴트생성자
	public ProductTO() {
	}

	// 매개변수 2개 생성자
	public ProductTO(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
