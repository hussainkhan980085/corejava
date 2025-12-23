package com.konic.java.constructors;

public class bankAccount {
	int accountno;
	String name;
	int balance;
	
	static String bankname = "SBI";
	
	bankAccount(int accountno,String name){
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;
		
	}
	
	void deposite(int amount) {
		balance +=amount;
	}
	
	
	void display() {
		System.out.println("bank:"+bankname);
		System.out.println("account no:"+accountno);
		System.out.println("customer:"+ name);
		System.out.println("balance:"+ balance);
		
		
	}

	public static void main(String[] args) {
		
		bankAccount acc = new bankAccount(101,"rahul");
		acc.deposite(5000);
		acc.display();		

	}

}
