package com.zhovnirchuk.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	
        Truck t = (Truck) context.getBean("truckBean");
    	t.drive();
    	Sedan s = (Sedan) context.getBean("sedanBean");
    	s.drive();
    	
    }
}