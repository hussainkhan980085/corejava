package com.koni.java.overloading;

public class BankAccount {
	
	public static void withdraw(int amount) {
		System.out.println("withdraw ₹:"+amount);
	}
	public static void withdraw(double amount) {
		System.out.println("withdraw ₹:"+amount);
    }
	
	public static void withdraw(int  amount ,String accountType) {
		System.out.println("withdraw amount ₹:"+amount+ " from "+ accountType+" account ");
	}

	public static void main(String[] args) {
		
		withdraw(500);
		withdraw(500.00);
		withdraw(1000,"current");
		

	}

}
