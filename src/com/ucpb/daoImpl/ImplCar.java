package com.ucpb.daoImpl;

import com.ucpb.dao.DaoCar;
import com.ucpb.model.ModelCar;

public class ImplCar implements DaoCar {

	public ImplCar(){
		 ModelCar mCar2 = new ModelCar(setUnit("GT5000"),setPrice(1505000.00),setName("GT"));
		 getData(mCar2);
		 
		 ModelCar mCar1 = new ModelCar("FR200",10000.00,"Ferrari");
		 newCar(mCar1);
	}

	@Override
	public ModelCar getData(ModelCar mCar) {
		// TODO Auto-generated method stub
		System.out.println("The old Car unit: " + mCar.getUnit());
		System.out.println("The old Car name: " + mCar.getName());
		System.out.println("The old Car price: " + mCar.getPrice());
		return null;
		
	}

	@Override
	public void newCar(ModelCar mCar) {
		// TODO Auto-generated method stub
		System.out.println("Car unit: " + mCar.getUnit());
		System.out.println("Car name: " + mCar.getName());
		System.out.println("Car price: " + mCar.getPrice());
	}

	@Override
	public double setPrice(double price) {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String setName(String name) {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String setUnit(String unit) {
		// TODO Auto-generated method stub
		return unit;
	}

}
