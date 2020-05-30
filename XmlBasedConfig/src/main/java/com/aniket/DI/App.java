package com.aniket.DI;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
    	
    	Vehicle obj=(Vehicle) context.getBean(Vehicle.class);
        obj.drive();
    }
}
