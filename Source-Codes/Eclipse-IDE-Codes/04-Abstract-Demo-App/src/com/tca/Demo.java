package com.tca;

import com.tca.entities.FullTimeStaff;
import com.tca.entities.PartTimeStaff;

public class Demo 
{

	public static void main(String[] args) 
	{
		FullTimeStaff fts = new FullTimeStaff("AAA","Pune","CS",10000.0);
		fts.display();
		
		System.out.println("--------------------------------");
		
		PartTimeStaff pts = new PartTimeStaff("BBB", "Mumbai", 3, 100 );
		pts.display();
	}

}
