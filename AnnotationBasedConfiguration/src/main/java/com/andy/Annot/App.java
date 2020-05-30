package com.andy.Annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
