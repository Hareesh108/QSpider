package com.Multithreading.basic;

public class Main {
	
	public static void main(String[] args) {
		
		MyThread1 myThread1 = new MyThread1();
		
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);
		
		myThread1.start();
		thread.start();
	}

}
