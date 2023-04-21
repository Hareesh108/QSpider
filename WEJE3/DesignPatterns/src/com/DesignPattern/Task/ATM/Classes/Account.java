package com.DesignPattern.Task.ATM.Classes;

public class Account {
	
	public static Account object;
	
	double accountBalance;
	public Account(double balanace) {
		accountBalance = balanace;
	}
	public Account(){}
	
	public static Account getBalance() {
		if (object == null) {
			object = new Account(10000);
		}
		return object;
	}

}
