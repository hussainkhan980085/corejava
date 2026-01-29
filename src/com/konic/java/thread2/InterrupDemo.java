package com.konic.java.thread2;

import com.konic.java.practice.test;

public class InterrupDemo extends Thread {
	
	public void run() {
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
		
	}
      	public static void main(String[] args) {
      		InterrupDemo t = new InterrupDemo();
      		t.start();
      		t.interrupt();
      		
		}
	
    }
