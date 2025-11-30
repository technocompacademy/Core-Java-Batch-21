package com.tca.entities;

public class PartTimeStaff extends Staff
{
	int numberOfHours;
	double ratePerHours;
	
	public PartTimeStaff(String name, String address, int numberofHours, double ratePerHours)
	{
		super(name,address);
		this.numberOfHours = numberofHours;
		this.ratePerHours = ratePerHours;
	}

	@Override
	public void display() 
	{
		System.out.println("Name         : " +  name);
	    System.out.println("Addres       : " + address);
	    System.out.println("No. of Hours : " + numberOfHours);
	    System.out.println("Rate Per hours :" + ratePerHours);
	    System.out.println("Total Amount   : " + (numberOfHours*ratePerHours) );
		
	}
	
}
