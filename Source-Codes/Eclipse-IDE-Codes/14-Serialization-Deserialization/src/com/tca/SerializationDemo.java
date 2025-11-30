package com.tca;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.tca.entities.Student;

public class SerializationDemo 
{
	public static void main(String[] args) throws Exception
	{
		Student s =  new Student(101,"AAA", 75.00);
		
		FileOutputStream fos = new FileOutputStream("resources/student.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		
		System.out.println("Serialization completed !!");
		
		
	}

}
