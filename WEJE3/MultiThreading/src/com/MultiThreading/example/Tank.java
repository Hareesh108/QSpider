package com.MultiThreading.example;

public class Tank extends Thread{
	private Water water;
	
	public Tank(Water water) {
		this.water = water;
	}
	
	@Override
	public void run() {
		water.FillTank("Filled");
	}
}
