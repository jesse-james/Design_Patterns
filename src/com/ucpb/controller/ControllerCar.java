package com.ucpb.controller;

import com.ucpb.model.ModelCar;
import com.ucpb.view.ViewCar;

public class ControllerCar {
	private ModelCar model;
	private ViewCar view;
	
	public ControllerCar(ModelCar model, ViewCar view) {
		this.model = model;
		this.view = view;
	}
	
	 public void setName(String name){
		 model.setName(name);
	 }
	 
	 public String getName(){
		 return model.getName();
	 }
	 
	 public void setUnit(String unit){
		 model.setUnit(unit);
	 }
	 
	 public String getUnit(){
		 return model.getUnit();
	 }
	 
	 public void setPrice(double price){
		 model.setPrice(price);
	 }
		 
	 public double getprice(){
		 return model.getPrice();
	 }
	 
	 public void updateView(){
		 view.printData(model.getUnit(), model.getPrice(), model.getName());
	 }

}
