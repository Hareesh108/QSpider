package com.Multithreading.basic;

public class MyThread1 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MyThread1 is Running");
		}
	}
	

}
