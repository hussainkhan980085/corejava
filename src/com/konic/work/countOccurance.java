package com.konic.work;

public class countOccurance {
	
	public static void main(String[] args) {
		
		
		int [] x= {2,3,2,4,2};
		
		int element = 2;
		int count = 0;
		
		
		for (int i =0;i<x.length;i++) {
			if (x[i]== element) {
				count++;
			}
		}
		
		System.out.println("occurence count:"+count);
	}

}
