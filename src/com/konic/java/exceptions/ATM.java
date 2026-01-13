package com.konic.java.exceptions;


public class ATM {

	
	private int correctPin  = 1234;
	private int dailyLimit  = 10000;
	
	  void withdraw(int pin, int amount)
	    throws InvalidAmountException, DailyLimitExceedException {
                 
		  if( pin != correctPin) {
			  throw new SecurityException("Invalid PIN");
		  }
	      if( amount <=0 ) {
	    	  throw new InvalidAmountException("Invalid Withdraw Amount");
	      }
	      
	      if (amount > dailyLimit) {
	    	  throw new DailyLimitExceedException("Daily Limit Exceeded");
	      }
	      
	      System.out.println("Withdraw Sucessful: " + amount);

	  }
}
