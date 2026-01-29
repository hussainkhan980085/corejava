package com.konic.java.thread2;

public class SleepDemo  extends Thread{
	public void run() {
		try {
			System.out.println("Thread Sleeping ");
			Thread.sleep(2000);
			System.out.println("Thread awake");   
		} catch (InterruptedException e) {
			
		}
	}
	  public static void main(String[] args) {
		new SleepDemo().start();
	  }
}


