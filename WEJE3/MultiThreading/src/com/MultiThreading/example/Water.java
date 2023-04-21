package com.MultiThreading.example;

public class Water {
	
	private String waterTank;
	
	public Water(String waterTank) {
		this.waterTank = waterTank;
	}
	
	public synchronized void TakeaBath() {
		System.out.println("Water tank is checking!!");
		if(waterTank == null) {
			System.out.println("Inside tank water is not Available");
			System.out.println("Please Wait till fill!!");
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Now you can take Bath");
	}
	
	public synchronized void FillTank(String fillTank) {
		
		System.out.println("Tank is Filling with water");
		waterTank = fillTank;
		
		this.notify();	
	}

}
