package com.MultiThreading.waitandnotify;


public class ThreadMain {
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		
		Friends friends1 = new Friends(pizza);
		Friends friends2 = new Friends(pizza);
		PizzaHut pizzaHut = new PizzaHut(pizza);
		
		friends1.start();
		friends2.start();
		pizzaHut.start();
	}

}
