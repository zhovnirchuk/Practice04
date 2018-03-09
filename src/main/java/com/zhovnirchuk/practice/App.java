package com.zhovnirchuk.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	
        Car t = (Car) context.getBean("truckBean");
    	t.drive();
    	Car s = (Car) context.getBean("sedanBean");
    	s.drive();
    	
    }
}