package com.tca.entities;

public class Student2020 extends Student 
{
	private String email;
	private String whatsapp;
	
		
	public Student2020() 
	{
		super();
	}

	public Student2020(int rno, String name, double per,String email, String whatsapp) 
	{
		super(rno,name,per);
		this.email = email;
		this.whatsapp = whatsapp;
	}
	
}
