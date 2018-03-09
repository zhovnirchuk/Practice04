package com.zhovnirchuk.practice;

import org.springframework.stereotype.Component;

@Component
public class Tire {
	
	private int size;
	
	public Tire() {
		this.size = 18;
	}
	
	public String toString() {
		return "Tire: size = " + this.size;
	}
	
}