package com.MultiThreading.waitandnotify;

public class Pizza {
	
	private int noOfPizza;
	
	public synchronized void orderPizza(int orderedPizza) {
		System.out.println("Ordering "+ orderedPizza + " Pizzas");
		
		if (orderedPizza > noOfPizza) {
			System.out.println(orderedPizza + " Pizzas not available");
			System.out.println("Please Wait");
			
			try {
				this.wait();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		noOfPizza -= orderedPizza;
		System.out.println("Ordered " + orderedPizza + " Pizzas Successfull");
		
	}
	
	public synchronized void makePizza(int madePizza) {
		System.out.println("Making " + madePizza + " Pizzas");
		noOfPizza += madePizza;
		System.out.println(noOfPizza + " Pizza available");
		this.notifyAll();
	}

}
