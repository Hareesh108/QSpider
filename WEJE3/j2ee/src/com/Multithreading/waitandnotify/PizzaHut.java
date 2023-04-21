package com.Multithreading.waitandnotify;

public class PizzaHut extends Thread{
	
	private Pizza pizza;
	
	public PizzaHut(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public void run() {
		pizza.makePizza(5);
	}

}
