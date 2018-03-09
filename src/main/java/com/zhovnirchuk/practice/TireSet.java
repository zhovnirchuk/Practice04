package com.zhovnirchuk.practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TireSet {

	private int amount;
	private List<Tire> tires;
	
	public TireSet() {
		this.amount = 4;
		this.tires = new ArrayList<Tire>();
		for(int i=0; i<amount; i++)
			this.tires.add(new Tire());
	}
	
	public void setTires(List<Tire> tires){
		this.tires = tires;
	}
	
	public List<Tire> getTires(){
		return this.tires;
	}
	
}
