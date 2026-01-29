package com.konic.java.thread2;

public class JoinDemo extends Thread {
     public void run() {
    	 try {
    		 Thread.sleep(2000);
    		 System.out.println("child finished");
    	 } catch (Exception e) {
		}
		
     }
     public static void main(String[] args) throws Exception {
		JoinDemo t = new JoinDemo();
		t.start();
		t.join();
		System.out.println("main continues");
	}
     
}

