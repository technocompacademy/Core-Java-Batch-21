package com.tca.geometry;

public class Circle implements Shape
{
	private double radius;

 	public Circle(double radius)
 	{
        this.radius = radius;
    }

	@Override
	public void printArea() 
	{
		double ans = Shape.PI * radius * radius;
	    System.out.println("Area of Circle :" +  ans); 
		
	}
}
	
