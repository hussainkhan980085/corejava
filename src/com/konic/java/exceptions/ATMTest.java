package com.konic.java.exceptions;

public class ATMTest {

    public static void main(String[] args) {

        ATM atm = new ATM();

        try {
            atm.withdraw(1234, -500);
        }
        catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        catch (DailyLimitExceedException   e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction Ended");
        }
    }
}
