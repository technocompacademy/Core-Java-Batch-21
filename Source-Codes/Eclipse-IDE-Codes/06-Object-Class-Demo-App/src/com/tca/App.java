package com.tca;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.tca.entities.Student;

public class App 
{
	public static void main(String[] args) 
	{
		
		Class<Student> c = Student.class;
		
		System.out.println("Parent of Student class : " +  c.getSuperclass());
		
		System.out.println(" ***** Data Memebers | Fields ********* ");
		
		Field f[] = c.getDeclaredFields(); // f--> rno,name,per
		
		for(Field fld : f)
		{
			System.out.println(fld);
		}
		
		System.out.println("\n ***** Methods ********* \n");
		
		Method m[] = c.getDeclaredMethods();
		
		for( Method mt:  m)
		{
			System.out.println(mt);
		}
		
		System.out.println("\n ***** Constructors ********* \n");
		
		Constructor cnstr[] = c.getDeclaredConstructors();
		
		for(Constructor con : cnstr)
		{
			System.out.println(con);
		}
	}

}









