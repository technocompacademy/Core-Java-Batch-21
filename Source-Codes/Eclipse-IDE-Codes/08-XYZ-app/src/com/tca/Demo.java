package com.tca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Demo {

	public static void main(String[] args) 
	{
		System.out.println("App Started.....");
			
				
		try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); )
		{
			System.out.print("Enter the String  : ");
			String s = br.readLine();
			String upperStr = s.toUpperCase();
			System.out.println("Upper case of given String  : " + upperStr);
		}
		catch(IOException ie)
		{
			System.out.println("I/O Problem :  Unable to read Input !!");
		}
		
		
		System.out.println("App Ended.....");

	}

}
