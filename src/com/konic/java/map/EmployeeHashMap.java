package com.konic.java.map;

import java.util.Map;

import com.konic.java.arraylist.Employee;

import java.util.HashMap;

public class EmployeeHashMap {

	
		
		  public static Map<Integer, Employee> addEmployees() {

		        Map<Integer, Employee> map = new HashMap<>(); 

		        map.put(101, new Employee(101, "Ayaan", "IT"));
		        map.put(102, new Employee(102, "Rahim", "HR"));
		        map.put(103, new Employee(103, "Sara", "Finance"));

		        return map;
		    }

		    public static void main(String[] args) {

		        Map<Integer, Employee> empMap = addEmployees();
		        System.out.println(empMap);
		    }
		

	}


