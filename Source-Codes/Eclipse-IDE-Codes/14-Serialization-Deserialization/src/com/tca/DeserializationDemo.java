package com.tca;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.tca.entities.Student;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("resources/student.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		
		Student s = (Student) ois.readObject();
		
		System.out.println(s);
		System.out.println("*** Roll number : " +  s.getRno());
		System.out.println("*** Name        : " + s.getName());
		System.out.println("*** Percentage  : " + s.getPer());
		
	}

}

