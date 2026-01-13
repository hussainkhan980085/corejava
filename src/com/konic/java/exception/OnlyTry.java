package com.konic.java.exception;

public class OnlyTry {

	public static void main(String[] args) {
	
				try {
					int i = 10/0;
				} finally {
					System.out.println("Always Executes");
				}
				}

			

	}


