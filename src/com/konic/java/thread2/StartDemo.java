package com.konic.java.thread2;


public class StartDemo extends Thread{
	
	public void run() {
		System.out.println("Thread Running : " + Thread.currentThread().getName());
	    }
	
	    public static void main(String[] args) {
			StartDemo t = new StartDemo();
			t.start();
		}
	
	

}
	