package com.MultiThreading.example;

import javax.management.loading.PrivateClassLoader;

public class TakeShower extends Thread {
	
	private Water water;
	
	public TakeShower (Water water) {
		this.water = water;
	}
	
	@Override
	public void run() {
		water.TakeaBath();
	}

}
