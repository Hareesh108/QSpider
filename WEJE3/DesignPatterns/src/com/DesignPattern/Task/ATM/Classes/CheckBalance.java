package com.DesignPattern.Task.ATM.Classes;

public class CheckBalance {
	
	public static void checkBalance() {
		
		Account objAccount = Account.getBalance();
		
		System.out.println("Total Amount is:" + objAccount.accountBalance);
			
	}

}
