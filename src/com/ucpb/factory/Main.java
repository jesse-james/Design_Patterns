package com.ucpb.factory;

import com.ucpb.factoryObjects.Student;
import com.ucpb.factoryObjects.Teacher;
import com.ucpb.factoryProducer.FactoryProducer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
