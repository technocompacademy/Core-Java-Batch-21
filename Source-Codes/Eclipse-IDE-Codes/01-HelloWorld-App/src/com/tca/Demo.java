package com.tca;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) 
	{
		System.out.println("Hello World...My First Application");
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalDate.of(2025, 13,11);
		
		System.out.println("Command Line Args :" + Arrays.toString(args));
		
		
		File f = new File("resource/study");
		
		if(f.exists())
		{
			if(f.isDirectory())
			{
				System.out.println(f.getName() + " is a directory !");
			}
			else
			{
				System.out.println(f.getName() + " is not a directory !");
			}
		}
		else
		{
			System.out.println(f.getName() + " does not exist !");
		}
	}

}
