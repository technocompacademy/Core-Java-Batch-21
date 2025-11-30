package com.tca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tca.entites.Student;

public class Demo 
{

	public static void main(String[] args) 
	{
				
		Student s1 = new Student(103,"Sachin",80);
		Student s2 = new Student(101,"Saniya", 90);
		Student s3 = new Student(102,"Sanket", 40);
		
		
		List<Student> L = new ArrayList<>();
		L.add(s1);
		L.add(s2);
		L.add(s3);
		
		System.out.println("Elements in List Before Sort : "+ L); 
				
		Collections.sort(L);
		
		System.out.println("Elements in List After Sort : " +  L);		
		
	}

}




