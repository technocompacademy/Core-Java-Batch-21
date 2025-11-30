package com.tca;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InvalidFeesException extends Exception 
{
	InvalidFeesException(String msg)
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
        
        int totalfees = 6000;
        int paidfees  = 2000;
        int remainingfees = totalfees-paidfees;

        
        try 
        {
        	System.out.println("Your Remaining Fees     : " + remainingfees);
        	System.out.print("Enter the amount to pay : ");
            int amount = Integer.parseInt(br.readLine());

            if(amount > remainingfees)
            {
                throw new InvalidFeesException("Paying amount is greater than remaining fees !!");
            }

           
            paidfees = paidfees + amount;
            remainingfees = remainingfees - amount;
            
            System.out.println("Payment Successfull");
            System.out.println("Total Course Fees   : " +  totalfees);
            System.out.println("Paid Amount         : " + paidfees );
            System.out.println("Remaining Amount     : " + remainingfees);

        }
        catch(IOException ie)
        {
            System.out.println("I/O Problem : Unable to read Input !!");
        }
        catch(NumberFormatException ne)
        {
            System.out.println("Problem : Given input is not a Number !!!");
        }
        catch(InvalidFeesException ie)
        {
            System.out.println(ie);
            //ie.printStackTrace();
        }
        System.out.println("App Ended.....");
    }
}



