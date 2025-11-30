package com.tca;

import com.tca.entities.Student;

public class App {

	public static void main(String[] args) 
	{

		Student s1 = new Student();
		s1.display();
		
		Student s2 = new Student(101,"AAA", 75.57);
		s2.display();
		
		
		Student s3 = new Student();
		s3.setRno(102);
		s3.setName("BBB");
		s3.setPer(90.87);
		
		s3.display();
		
		System.out.println("****Main******");
		System.out.println("Roll Number : " + s3.getRno());
		System.out.println("Name        : " + s3.getName());
		System.out.println("Percentage  : " + s3.getPer());
		

	}

}
