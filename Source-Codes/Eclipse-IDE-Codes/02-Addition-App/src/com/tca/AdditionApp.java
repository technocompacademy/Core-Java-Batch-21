package com.tca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionApp 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the First Number : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the Second Number : ");
		int b = Integer.parseInt(br.readLine());
				
		int c = a + b;
		
		System.out.println("Sum is " + c );
	}

}
