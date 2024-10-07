package com.autowiring.autowiring1_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program execution started" );
        ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
        Student student = con.getBean("student",Student.class);
        System.out.println(student);
        Certificate cert = con.getBean("certi",Certificate.class);
        System.out.println(cert);
        System.out.println("program execution ended");
    }
}
