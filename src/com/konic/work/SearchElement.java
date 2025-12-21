package com.konic.work;

public class SearchElement {

	public static void main(String[] args) {
		
		int [] element = {5,10,15,20};
		int searchelement = 15;
		
		boolean found = false;
		
		
		for (int i =0;i<element.length;i++) {
			
		if (element[i] == searchelement) {
			found = true;
			break;
			}
		}
			
		if (found) {
		System.out.println("search element found");
		}else {
		System.out.println("search element not found");
			
		}
		
		

	}

}
