package com.koni.java.overloading;

public class onlineshopping {
	
	public static void addToCart(int itemId) {
		System.out.println("product:"+itemId+" added to cart");
	}
	
	public static void addToCart(int itemId,int quentity ) {
		
	System.out.println("Product:"+itemId +" added with quentity: "+ quentity);
	}
	public static void addToCart(String itemName) {
		System.out.println("itemName:"+ itemName);
	}
	public static void main(String[] args) {
		addToCart(101);
		addToCart(101,3);
		addToCart("earphones");

	}

}
