package com.konic.java.thread2;

public class NameDemo extends Thread{
	public void run() {
		System.out.println("Thread Name : " + getName());
	}
	public static void main(String[] args) {
		NameDemo t  = new NameDemo();
		t.setName("Worker-Thread");
		t.start();
	}
}
