package com.konic.java.throwcatch.exception;

class ATMExample {

    public static void main(String[] args) {

        int balance = 5000;
        int withdrawAmount = 7000;

        try {
          
            if (withdrawAmount > balance) {
                throw new ArithmeticException("Insufficient balance");
            }

            System.out.println("Please collect your cash");  

        } catch (ArithmeticException e) {
    
            System.out.println("Exception handled: " + e.getMessage());
        }

        System.out.println("Transaction completed");
    }
}
