package com.annotation.AnnotationConfig;

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
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    	
    	Vehicle obj=(Vehicle) context.getBean(Bike.class);
        obj.drive();
        Vehicle obj1=(Vehicle) context.getBean(Car.class);
        obj1.drive();
    	//Bean Property Example
//    	Tyre t = (Tyre) context.getBean(Tyre.class);
//    	System.out.println(t);
    } 
}
