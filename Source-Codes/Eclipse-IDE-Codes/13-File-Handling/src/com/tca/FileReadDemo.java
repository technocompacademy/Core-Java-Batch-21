package com.tca;

import java.io.*;
import java.util.*;

public class FileReadDemo
{
    public static void main(String[] args) 
    {
        Scanner  sc= new Scanner(System.in);

        System.out.print("Enter the File Name to Read : ");
        String fname = sc.nextLine();
          

        try( FileReader fr = new FileReader(fname);)  
        {
            System.out.println("Content of a File : " +  fname);
            while(true)
            {
                int ch =  fr.read();

                if(ch==-1)
                {
                    break;
                }

                System.out.print((char) ch);
            }
        }
        catch(Exception e)
        {
            System.out.println("Problem : Unable to read file !!!");
        }
        
    }
}


