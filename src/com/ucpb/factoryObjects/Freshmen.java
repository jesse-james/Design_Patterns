package com.ucpb.factoryObjects;

public class Freshmen  implements Student{

	@Override
	public int getGrade() {
		// TODO Auto-generated method stub
		System.out.println("First Year.");
		return 0;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		System.out.println("16 Years Old.");
		return 0;
	}

}