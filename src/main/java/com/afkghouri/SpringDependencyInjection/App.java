package com.afkghouri.SpringDependencyInjection;

import org.omg.CORBA.portable.ApplicationException;
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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/afkghouri/SpringDependencyInjection/ObjectCreation.xml"); 
        ShapeService shapeService = (ShapeService) applicationContext.getBean("shapeserviceobj");
        shapeService.askForDraw();
    }
}
