package com.konic.java.map;


	


	import java.util.HashMap;
	import java.util.Map;

	public class employeehashmaps {
		
	    // Add employees (reuse method)
	    public static Map<Integer, employeeId> addEmployees() {

	        Map<Integer, employeeId> map = new HashMap<>();
	        map.put(101, new employeeId(101, "Ayaan", "IT"));
	        map.put(102, new employeeId(102, "Rahim", "HR"));
	        map.put(103, new employeeId(103, "Sara", "Finance"));

	        return map;
	    }

	    // Get Employee by ID
	    public static employeeId getEmployeeById(int id) {

	        Map<Integer, employeeId> map = addEmployees();
	        return map.get(id);
	    }

	    public static void main(String[] args) {

	    	employeeId emp = getEmployeeById(102);

	        if (emp != null) {
	            System.out.println("employeeId Found: " + emp);
	        } else {
	            System.out.println("Employee Not Found");
	        }
	    }
	}



