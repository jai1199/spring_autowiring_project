package com.autowiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

  public static void main(String[] args) 
  { 
	  System.out.println("program execution started");
	  ApplicationContext context = new ClassPathXmlApplicationContext("bytypespring.xml");
	  Student s = (Student)context.getBean("std");
	  System.out.println(s);
	  College c = (College) context.getBean("clg");
	  System.out.println(c);
	  System.out.println("program execution ended");
  }
  
}
