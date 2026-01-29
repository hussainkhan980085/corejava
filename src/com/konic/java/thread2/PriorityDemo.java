package com.konic.java.thread2;

public class PriorityDemo extends Thread{
	public void run(){
		System.out.println(getName() + " priority " + getPriority());
		
	}
public static void main(String[] args) {
	PriorityDemo t = new PriorityDemo();
	t.setPriority(10);
	t.start();
	
}
	
}
