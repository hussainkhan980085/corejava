package com.konic.java.exceptions;

public class Example11 {

	public static void main(String[] args) {
		
		
		/// finaly not excuted ......
		
		try { 
			System.exit(0); 
			} finally { 
			System.out.println("Won't execute"); 
			}

	}

}
