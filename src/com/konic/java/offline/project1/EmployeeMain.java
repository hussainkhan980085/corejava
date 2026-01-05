package com.konic.java.offline.project1;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		EmployeeService service = new EmployeeService();

        service.addEmployees();
        service.removeDuplicateEmployees();
        service.sortEmployees();
        service.storeInLinkedHashMap();
        service.storeInTreeMap();
        service.getEmployeeById(103);
        service.removeEmployeeSafely();

        System.out.println("\nCompany Name: " + Employee.getCompanyName());
         }

	}


