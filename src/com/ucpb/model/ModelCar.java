package com.ucpb.model;

public class ModelCar {

	private String unit;
	private double price;
	private String name;
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ModelCar(String unit, double price, String name) {
		this.unit = unit;
		this.price = price;
		this.name = name;
	}
	public ModelCar() {
		// TODO Auto-generated constructor stub
	}
}
