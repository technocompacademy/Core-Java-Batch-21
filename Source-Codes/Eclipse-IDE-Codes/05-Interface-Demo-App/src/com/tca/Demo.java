package com.tca;

interface I
{
	default void display()
	{
		System.out.println("I am in display !!!");
		String g = giveGrade(20);
		System.out.println("Your Grade : " + g);
	}
	
	private String giveGrade(double per)
	{
		if(per >= 70 )
			return "Distinction";
		else if (per >=60)
			return "First class";
		else if(per>=40)
			return "Pass class";
		else 
			return "fail";
	}
	
	abstract void show();
	
}

class Xyz implements I
{

	@Override
	public void show() 
	{
		System.out.println("I am in show");
		
	}
	
}
public class Demo 
{

	public static void main(String[] args) 
	{
		Xyz ob = new Xyz();
		ob.display();
		ob.show();
		

	}

}
