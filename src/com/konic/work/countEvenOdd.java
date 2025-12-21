package com.konic.work;

public class countEvenOdd {

	public static void main(String[] args) {
		int [] count= {1,2,3,4,5,6};
		int evencount = 0;
		int oddcount = 0;
		
		for (int i =0;i<count.length;i++) {
			if(count[i]%2 ==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}

		System.out.println("evencount:"+evencount);

		System.out.println("oddcount:"+oddcount);
	}

}
