package com.konic.java.insufficentbalance;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ATMService atm = new ATMService();
		
		try {
			System.out.println("Enter Withdraw Amount: ");
			double amount = sc.nextDouble();
			
			atm.withdraw(amount);
			
		}catch (IllegalArgumentException e) {
			System.out.println("Invalid Amount" + e.getMessage());
		}catch (InsufficientBalanceException e) {
			System.out.println("Transaction Failed: " + e.getMessage());
		}finally {
			System.out.println("Transaction Completed");
		}
		
	}

}
