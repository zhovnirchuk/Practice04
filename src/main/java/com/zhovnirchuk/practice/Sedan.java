package com.zhovnirchuk.practice;

import org.springframework.beans.factory.annotation.Autowired;

public class Sedan implements Car {

	private TireSet tires;
	private String title;
	
	
	public Sedan(String title) {
		this.title = title;
	}

	@Autowired
	public void setTires(TireSet tires) {
		this.tires = tires;
	}

	public void drive() {
		System.out.println("Sedan " + this.title + ", tires: ");
		for(Tire t : this.tires.getTires()) {
			System.out.println(t + " - is runninng");
		}
	}

}