package com.konic.java.thread2;

public class RunDemo extends Thread {
	
	public void run() {
		System.out.println("Running in : " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		RunDemo t =  new RunDemo();
		t.run();
		
	}

}
