package com.konic.work;

public class largestnum {

	public static void main(String[] args) {
		
		int [] number = {45,22,89,10};
		int largest = number[0];
		
		for (int i=1;i<number.length;i++) {
			if (number[i]> largest) {
				largest=number[i];
			}
		}
		
		System.out.println("largest number is :"+largest);

	}

}
