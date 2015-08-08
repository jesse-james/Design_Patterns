package com.ucpb.factory;

import com.ucpb.factoryObjects.Freshmen;
import com.ucpb.factoryObjects.Junior;
import com.ucpb.factoryObjects.Sophomore;
import com.ucpb.factoryObjects.Student;
import com.ucpb.factoryObjects.Teacher;

public class StudentFactory extends AbstractFactory {

	@Override
	public Student getData(String grade) {
		// TODO Auto-generated method stub
		if(grade == null){
			return null;
		}
		if(grade.equalsIgnoreCase("FRESHMEN")){
			return new Freshmen();
		} else if(grade.equalsIgnoreCase("SOPHOMORE")){
			return new Sophomore();
		} else if(grade.equalsIgnoreCase("JUNIOR")){
			return new Junior();
		}
		
		return null;
	}
	

	@Override
	public Teacher getDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

}
