package com.konic.java.thread2;

public class AliveDemo extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		
	}
	public static void main(String[] args) {
		AliveDemo t = new AliveDemo();
		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());
	}

}
