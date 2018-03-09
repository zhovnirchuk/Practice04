package com.zhovnirchuk.practice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Passenger {
	
	@Pointcut("execution(* com.zhovnirchuk.practice.Car.drive())")
	public void driveCar() {}
	
	@Before("driveCar()")
	public void getIntoCar() {
		System.out.println("Getting into the car...");
	}
	
	@After("driveCar()")
	public void getOutOfCar() {
		System.out.println("Getting out of the car...");
	}
	
}
