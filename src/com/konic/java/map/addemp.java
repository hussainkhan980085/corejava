package com.konic.java.map;

import java.util.*;



public class addemp {
	
	
	   
	 public Map<Integer,employee> adddata(){
	   
		 employee e1 = new employee();
	 
	 e1.setId(101);
	 e1.setName("Khan");
	 e1.setDept("IT");
	 
	 employee e2 = new employee();
	 e2.setId(102);
	 e2.setName("Hussain");
	 e2.setDept("HR");
	 
	 employee e3 = new employee();
	 e3.setId(103);
	 e3.setName("munna");
	 e3.setDept("Marketing");
	 
	 Map <Integer,employee> map = new HashMap<>();
	 map.put(e1.getId(),e1);
	 map.put(e2.getId(),e2);
	 map.put(e3.getId(),e3);
	 
	 return map;
	 
	 }
	 public static void main(String[] args) {
		 
		 addemp add =new addemp();
		 add.adddata();
		 
		System.out.println("employee data  :"+ add.adddata());
		
	}
}
