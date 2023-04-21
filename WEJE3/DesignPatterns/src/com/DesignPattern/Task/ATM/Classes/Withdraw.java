package com.DesignPattern.Task.ATM.Classes;

public class Withdraw {
	
	public static void credit(double value) {
		
		Account objAccount = Account.getBalance();
		
		if (objAccount.accountBalance > value) {
			objAccount.accountBalance = objAccount.accountBalance - value;
			System.out.println(value + " has been credited");
		}
		else {
			System.out.println("Insufficient Balance");
		}
			
	}

}
