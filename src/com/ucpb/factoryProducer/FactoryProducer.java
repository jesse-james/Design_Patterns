package com.ucpb.factoryProducer;

import com.ucpb.factory.AbstractFactory;
import com.ucpb.factory.StudentFactory;
import com.ucpb.factory.TeacherFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		
		if(choice.equalsIgnoreCase("STUDENT")){
			return new StudentFactory();
		} else if(choice.equalsIgnoreCase("TEACHER")){
			return new TeacherFactory();
		}
		
		return null;
	}
	
}
