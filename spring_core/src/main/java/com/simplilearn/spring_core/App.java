package com.simplilearn.spring_core;

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
        System.out.println( "Hello World!" );



        ApplicationContext context = new 	ClassPathXmlApplicationContext("application.xml");

        Employee e1  = (Employee)context.getBean("emp");

        	System.out.println(e1);

        	System.out.println(e1.getEid() +"  "+e1.getEname());


    }
}