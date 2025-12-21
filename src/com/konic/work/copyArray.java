package com.konic.work;

public class copyArray {

	public static void main(String[] args) {
		int [] aray1 = {10,20,30};
		
		int [] aray2 = new int[aray1.length];
		
		for(int i = 0;i<aray1.length;i++) {
			aray2[i] = aray1[i];
		}

		System.out.println("copied aray:");
		for(int i =0;i<aray2.length;i++) {
			System.out.println(aray2[i]+"");
		}
		
	}

}
