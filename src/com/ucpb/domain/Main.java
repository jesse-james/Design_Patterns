package com.ucpb.domain;

import com.ucpb.controller.ControllerCar;
import com.ucpb.dao.DaoCar;
import com.ucpb.daoImpl.ImplCar;
import com.ucpb.factory.AbstractFactory;
import com.ucpb.factoryObjects.Student;
import com.ucpb.factoryObjects.Teacher;
import com.ucpb.factoryProducer.FactoryProducer;
import com.ucpb.model.ModelCar;
import com.ucpb.view.ViewCar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main m = new Main();
		System.out.println("This is for MVC:");
		m.MVC();
		System.out.println("\n\nThis is for DAO:");
		m.DAO();
		System.out.println("\n\nThis is for Factory:");
		m.Factory();
	}
	//-----------------MCV
	public void MVC() {
		ModelCar model = returnModel();
		ViewCar view = new ViewCar();
		
		ControllerCar controller = new ControllerCar(model, view);
		
		controller.updateView();
		 //update model data
		
	}
	//-----------------use for MCV
	public static ModelCar returnModel() {
		ModelCar mCar = new ModelCar();
		mCar.setUnit("GT5000");
		mCar.setName("GT");
		mCar.setPrice(1505000.00);
		return mCar;
	}
	//-----------------DAO
	public DaoCar DAO() {
		DaoCar dCar = new ImplCar();
		return dCar;
	}
	//-----------------Factory
	public void Factory() {
		AbstractFactory stFactory = FactoryProducer.getFactory("STUDENT");
		
		Student stud1 = stFactory.getData("FRESHMEN");
		stud1.getGrade();
		stud1.getAge();
		
		Student stud2 = stFactory.getData("SOPHOMORE");
		stud2.getGrade();
		stud2.getAge();
		
		Student stud3 = stFactory.getData("JUNIOR");
		stud3.getGrade();
		stud3.getAge();
		
		AbstractFactory teFactory = FactoryProducer.getFactory("TEACHER");
		
		Teacher te1 = teFactory.getDepartment("ENGLISH");
		te1.getDepartment();
		
		Teacher te2 = teFactory.getDepartment("MATHEMATICS");
		te2.getDepartment();
		
		Teacher te3 = teFactory.getDepartment("FILIPINO");
		te3.getDepartment();
	}
	
}
