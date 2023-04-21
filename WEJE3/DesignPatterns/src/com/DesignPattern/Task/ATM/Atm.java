package com.DesignPattern.Task.ATM;

import java.util.Scanner;

import com.DesignPattern.Task.ATM.Classes.Account;
import com.DesignPattern.Task.ATM.Classes.CheckBalance;
import com.DesignPattern.Task.ATM.Classes.Deposit;
import com.DesignPattern.Task.ATM.Classes.Withdraw;

public class Atm {
	
	static private Account account;
	
	public static void main(String[] args) {
		
		boolean loop = true;
	
		
		while(loop) {
			System.out.println("---ATM---"
					+ "\n1.Withdraw" 
					+ "\n2.Deposite"
					+"\n3.CheckBalance"
					+"\n4.Exit");
			Scanner scanner = new Scanner(System.in);
			int choise = scanner.nextInt();
			account = Account.getBalance();
			switch (choise) {
			case 1: {
				
				System.out.println("Enter a amount to credit");
				double value = scanner.nextDouble();
				Withdraw.credit(value);
				break;
				
			}
			case 2: {
				System.out.println("Enter a amount to debit");
				double value = scanner.nextDouble();
				Deposit.debit(value);
				break;
			}
			case 3: {
				CheckBalance.checkBalance();
				break;
			}
			case 4: {
				loop = false;
				System.out.println("Thank you..Visit Again!!");
				break;
			}
			default:
				System.out.println("Invalid Input");
				
			}
					
		}
	}

}
