package com.ucpb.factory;

import com.ucpb.factoryObjects.English;
import com.ucpb.factoryObjects.Filipino;
import com.ucpb.factoryObjects.Mathematics;
import com.ucpb.factoryObjects.Student;
import com.ucpb.factoryObjects.Teacher;

public class TeacherFactory extends AbstractFactory {

	@Override
	public Student getData(String grade) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Teacher getDepartment(String department) {
		// TODO Auto-generated method stub
		if(department == null){
			return null;
		}
		if(department.equalsIgnoreCase("ENGLISH")){
			return new English();
		} else if(department.equalsIgnoreCase("FILIPINO")){
			return new Filipino();
		} else if(department.equalsIgnoreCase("MATHEMATICS")){
			return new Mathematics();
		}
		
		return null;
	}



}
