package com.konic.java.exception;

public class MultiCathBlock {

	public static void main(String[] args) {
		
      try {
    	  String  s= null;
    	 s.length();
      } catch (NullPointerException e) {
    	  System.out.println("Null issue");
      } catch (Exception e) {
    	  System.out.println("General Issue");
      }
	}
}


