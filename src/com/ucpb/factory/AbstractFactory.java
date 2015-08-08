package com.ucpb.factory;

import com.ucpb.factoryObjects.Student;
import com.ucpb.factoryObjects.Teacher;

public abstract class AbstractFactory {

	public abstract Student getData(String grade);
	public abstract Teacher getDepartment(String department);
	
}
