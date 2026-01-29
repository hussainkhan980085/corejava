package com.konic.java.thread2;

public class YieldDemo extends Thread {
	public void run() {
		for (int i=1; i<=3;i++) {
			System.out.println(getName() + "running");
			Thread.yield();
		}
	}
 public static void main(String[] args) {
	 
	    new YieldDemo() .start();
	    new YieldDemo() .start();
   }
 }
