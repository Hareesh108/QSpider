package com.DesignPattern.Factory.Example1.mobilemain;

import java.util.Scanner;

import com.DesignPattern.Factory.Example1.mobile.Mobile;
import com.DesignPattern.Factory.Example1.mobiles.IPhone11;
import com.DesignPattern.Factory.Example1.mobiles.OnePluse;
import com.DesignPattern.Factory.Example1.mobiles.Oppo;
import com.DesignPattern.Factory.Example1.mobiles.Poco;
import com.DesignPattern.Factory.Example1.mobiles.Vivo;

public class Main {
	
	public static boolean loop = true;
	private static Scanner scanner;
	private static Mobile mobile;
	
	public static void main(String[] args) {
		
		 while(loop) {
			 try {
				 factory().start();
			 }
			 catch (NullPointerException e) {
				System.out.println("No Mobile Selected");
			}
		 }
	}
	
	public static Mobile factory() {
		System.out.println("SELECT MOBILE"
				+"\n1. IPhone" 
				+"\n2. OnePluse"
				+"\n3. Oppo"
				+"\n4. Poco"
				+"\n5. Vivo");
		scanner = new Scanner(System.in);
		int choise = scanner.nextInt();
		switch (choise) {
		case 1: 
			mobile = new IPhone11();
			return mobile;
		case 2: 
			mobile = new OnePluse();
			return mobile;
		case 3: 
			mobile = new Oppo();
			return mobile;
		case 4: 
			mobile = new Poco();
			return mobile;
		case 5: 
			mobile = new Vivo();
			return mobile;
			
		default:
			loop = false;
			System.out.println("Invalid");
			return null;
		}
	}

}
