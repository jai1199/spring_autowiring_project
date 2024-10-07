package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		System.out.println("program started");
		ApplicationContext con = new ClassPathXmlApplicationContext("annotation.xml");
		Ipl i = con.getBean("ipl",Ipl.class);
		System.out.println(i);
        System.out.println("program ended");
	}

}
