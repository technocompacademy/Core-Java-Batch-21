package com.tca.entities;

public class FullTimeStaff extends Staff 
{
	 String dept;
	 double salary;

	 public FullTimeStaff(String name, String address, String dept, double salary)
	 {
	        super(name,address);
	        this.dept = dept;
	        this.salary = salary;
	 }

	@Override
	public void display()
    {
       System.out.println("Name   : " +  name);
       System.out.println("Addres : " + address);
       System.out.println("Dept   : " + dept);
       System.out.println("Salary : " +  salary); 
    }
	
	
}
