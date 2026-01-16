package com.konic.java.insufficentbalance;

public class ATMService {
	
	 private double balance = 5000;
	 
	 public void withdraw(double amount) throws InsufficientBalanceException {
		 
		 if(amount<=0) {
			 throw new IllegalArgumentException("Amount must be more then Zero ");
		 }
		 if (amount< balance) {
		    throw new InsufficientBalanceException("Insufficent Balance");
	    }
		 
		 balance = balance - amount;
		 System.out.println("Withdraw Sucessfully");
		 System.out.println("Remaining Balance" + balance);
		 
	 }		 

}
