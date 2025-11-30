package com.tca;

import com.tca.geometry.Circle;
import com.tca.geometry.Cylinder;

@FunctionalInterface
interface A
{
	abstract public void display();
}

class B implements A
{
	public void display()
	{
		System.out.println("I am in display");
	}
	
}

public class App {

	public static void main(String[] args) 
	{
	     Circle circle =  new Circle(2.5);

	     Cylinder cylinder = new Cylinder(2.5, 5.0);

	     circle.printArea();
	     cylinder.printArea();
		
	}

}


