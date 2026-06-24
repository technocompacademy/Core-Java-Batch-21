package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.WelcomeBean;

public class App 
{
    public static void main(String[] args) 
    {
    	
    	//Step 1 : Creating and Starting Container
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       
       // Step 2: Get the object of Bean 
       
       //Object obj =  context.getBean(WelcomeBean.class);
       /*
       		Object obj =  context.getBean("welcomeBean");
       		WelcomeBean wb = (WelcomeBean) obj;
       */   
       
       WelcomeBean wb = (WelcomeBean) context.getBean("welcomeBean");
       
       // Step 3 : Call bean method / Bussiness Logic
       String msg = wb.getMessage();
       
       System.out.println(msg);
       
       
       
    }
}
