package com.ucpb.dao;

import com.ucpb.model.ModelCar;

public interface DaoCar {
	
	public ModelCar getData(ModelCar mCar);
	public double setPrice(double price);
	public String setName(String name);
	public String setUnit(String unit);
	
	public void newCar(ModelCar mCar);
}
