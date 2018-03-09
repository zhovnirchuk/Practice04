package com.zhovnirchuk.practice;

import org.springframework.beans.factory.annotation.Autowired;

public class Truck implements Car {
	
	private TireSet tires;
	private String title;
	private String cargo;
	
	public Truck(String title) {
		this.title = title;
	}
	
	@Autowired
	public void setTires(TireSet tires) {
		this.tires = tires;
	}
	
	@Autowired(required=false)
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void drive() {
		String tempCargo = this.cargo;
		if(this.cargo == null) {
			tempCargo = "nothing";
		}
		System.out.println("Truck " + this.title + ", delivers " + tempCargo + ", tires: ");
		for(Tire t : this.tires.getTires()) {
			System.out.println(t + " - is runninng");
		}
	}

}