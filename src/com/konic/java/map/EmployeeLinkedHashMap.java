package com.konic.java.map;


import java.util.*;


public class EmployeeLinkedHashMap {
	
	
	Map<Integer,employee> map = new LinkedHashMap<>() ;
		
	 public Map<Integer,employee>adddata(){
	
	employee e1 = new employee();
	e1.setId(101); 
	e1.setName("Yaseen");
	e1.setDept("HR");
	
	employee e2 = new employee();
	e2.setId(102);
	e2.setName("Hassain");
	e2.setDept("IT");
	
	employee e3 = new employee();
	e3.setId(103);
	e3.setName("hussain");
	e3.setDept("Marketing");
	
	employee e4 = new employee();
	e4.setId(104);
	e4.setName("khan");
	e4.setDept("HR");
	
	map.put(e1.getId(),e1);
	map.put(e2.getId(),e2);
	map.put(e3.getId(),e3);
	
	
	return map;

	
	///Public String toString()
	
	}
	 
	 public static void main(String[] args) {
		 
		 EmployeeLinkedHashMap employeeLinkedHashMap = new EmployeeLinkedHashMap();
		 
		 employeeLinkedHashMap.adddata();
		 
		  System.out.println(employeeLinkedHashMap.map);
		  ///------- get data by id number
		  
		  System.out.println("employee :"+employeeLinkedHashMap.map.get(102));
		  
		  ////====update employee department..
		  
		  employeeLinkedHashMap.map.get(103).setName("hussain khan");
		  System.out.println("updated employee: "+employeeLinkedHashMap.map.get(103));
		  
		  ////===remove employee by id...
		    
		  employeeLinkedHashMap.map.remove(101);
		  
		System.out.println("Remaining employees: "+employeeLinkedHashMap.map);
		  
		 
	}
	 
	 
}
