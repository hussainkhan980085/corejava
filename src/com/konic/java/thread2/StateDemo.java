package com.konic.java.thread2;

public class StateDemo extends Thread{
	public void run() {
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			
		}
		
	}
     public static void main(String[] args) throws Exception {
    	 StateDemo t = new StateDemo();
    	 System.out.println(t.getState());
    	 t.start();
    	 Thread.sleep(100);
    	 System.out.println(t.getState());
    	 t.join();
    	 System.out.println(t.getState());
    	 
		
	}
}
