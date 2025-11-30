package com.tca;

import java.io.File;

public class Demo 
{
	public static void main(String[] args) 
	{
		File f = new File(args[0]);

        if ( ! f.exists() )
        {
            System.out.println(args[0] + " : File Does not Exist !!");
            System.exit(0);
        }

        if( ! f.isFile())
        {
            System.out.println(args[0] + " : Given name is not a File !");
            System.exit(0);
        }

        System.out.println(args[0] + ": Given name is a valid file name");
	}
}
