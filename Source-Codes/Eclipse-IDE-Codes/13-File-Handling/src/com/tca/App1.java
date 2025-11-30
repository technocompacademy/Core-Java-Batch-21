package com.tca;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 
{

	 public static void main(String[] args) throws IOException 
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        System.out.print("Enter File Name : ");
	        String fname =  br.readLine();

	        File f = new File(fname);

	        if ( ! f.exists() )
	        {
	            System.out.println(fname + " : File Does not Exist !!");
	            System.exit(0);
	        }

	        if( ! f.isFile())
	        {
	            System.out.println(fname + " : Given name is not a File !");
	            System.exit(0);
	        }

	        System.out.println(fname + ": Given name is a valid file name");
	      
	       
	    }

}
