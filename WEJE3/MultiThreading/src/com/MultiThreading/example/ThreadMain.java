package com.MultiThreading.example;

public class ThreadMain {
	public static void main(String[] args) {
		Water water = new Water(null);
		
		TakeShower takeShower = new TakeShower(water);
		Tank tank = new Tank(water);
		
		takeShower.start();
		tank.start();
	}

}
