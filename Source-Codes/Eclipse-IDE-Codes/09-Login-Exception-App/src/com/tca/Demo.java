package com.tca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InvalidLoginException extends Exception
{
	public InvalidLoginException(String msg) 
	{
		super(msg);
	}
}
public class Demo 
{
	public static void main(String[] args) {
		
		System.out.println("App Started.....");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		try
		{
			System.out.print("Enter the Username  : ");
			String user = br.readLine();
			
			System.out.print("Enter the Password  : ");
			String pwd = br.readLine();
			
			if(user.equals("sachin") && pwd.equals("tca"))
			{
				System.out.println("Login Successful !");
			}
			else
			{
				throw new InvalidLoginException("Invalid Login Credentials !");
			}
			
		}
		catch(IOException ie)
		{
			System.out.println("I/O Problem :  Unable to read Input !!");
		} 
		catch (InvalidLoginException le) 
		{
			System.out.println(le);
			// e.printStackTrace();
		}
		finally
		{
			
			try 
			{
				br.close();	
			} 
			catch (IOException e) 
			{
				System.out.println("Problem While closing resource !!");
			}
			
		}
		
		System.out.println("App Ended.....");

	}
}
