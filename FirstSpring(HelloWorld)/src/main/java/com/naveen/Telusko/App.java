package com.naveen.Telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	@SuppressWarnings("resource")
		ApplicationContext con = new ClassPathXmlApplicationContext("SpringConfig.xml");
    	Student student = con.getBean(Student.class);
    	student.display();
    }
}
