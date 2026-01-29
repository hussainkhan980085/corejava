package com.konic.java.thread2;

public class CurrentDemo extends Thread{
	
	public static void main(String[] args) {
		 Thread t = Thread.currentThread();
		 System.out.println(t.getName());
	}

}
