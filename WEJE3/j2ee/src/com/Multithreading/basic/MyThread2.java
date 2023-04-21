package com.Multithreading.basic;

public class MyThread2  implements Runnable{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MyThread2 is Running");
		}
	}
}
