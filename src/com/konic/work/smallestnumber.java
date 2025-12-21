package com.konic.work;

public class smallestnumber {
	
	public static void main(String[] args) {
		
		int [] n= {	45,22,89,10};
		int smallest = n[0];
		
		for(int i = 1;i < n.length;i++) {
	    if(n[i] < smallest) {
	    	smallest = n[1];
	    }
	    		
	    }
		System.out.println("smallest number:"+smallest);
		
		
	}

}
