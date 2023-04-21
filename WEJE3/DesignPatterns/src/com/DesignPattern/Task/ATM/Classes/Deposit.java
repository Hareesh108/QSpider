package com.DesignPattern.Task.ATM.Classes;

public class Deposit {
	
	public static void debit(double value) {
		
		Account objAccount = Account.getBalance();
		
		objAccount.accountBalance = objAccount.accountBalance + value;
		System.out.println(value + " has been debited");
		System.out.println("Total Amount is:" + objAccount.accountBalance);
			
	}

}
