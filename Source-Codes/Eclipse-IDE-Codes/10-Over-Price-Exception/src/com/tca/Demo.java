package com.tca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class OverPriceException extends Exception 
{
	OverPriceException(String msg)
    {
        super(msg);
    }
}

public class Demo
{
    public static void main(String[] args) 
    {
        System.out.println("App Started.....");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try 
        {
        	System.out.print("Enter the Item Code : ");
            int code = Integer.parseInt(br.readLine());
            
            System.out.print("Enter the Item Name : ");
            String name = br.readLine();
        	
            System.out.print("Enter the Item Price : ");
            double price = Double.parseDouble(br.readLine());

            if(price > 9999)
            {
                throw new OverPriceException("Selected Item is Over-Priced !!");
            }

            System.out.println("Item is Selected");
            System.out.println("Item Code  : " +  code);
            System.out.println("Item Name  : " + name );
            System.out.println("Item Price : " + price);

        }
        catch(IOException ie)
        {
            System.out.println("I/O Problem : Unable to read Input !!");
        }
        catch(NumberFormatException ne)
        {
            System.out.println("Problem : Given input is not a Number !!!");
        }
        catch(OverPriceException oe)
        {
            System.out.println(oe);
            //oe.printStackTrace();
        }
        System.out.println("App Ended.....");
    }
}


