package com.konic.java.throwcatch.exception;

public class ExamTimeOut {

	public static void main(String[] args) {
		
		int time = 60;
		
		if(time > 59) {
			throw new RuntimeException("Time Over! Exam Ended");
		}
      
	}

}
