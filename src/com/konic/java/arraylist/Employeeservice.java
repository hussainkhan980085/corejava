package com.konic.java.arraylist;

import java.util.ArrayList;
import java.util.List;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Employeeservice {
	
	public static List<Employee> addemployees(){

	List<Employee> list = new ArrayList<>();

	Employee e1 = new Employee();

	e1.setId(101);
	e1.setName("Ayaan");
	e1.setDept("IT");

	Employee e2 = new Employee();
	e2.setId(102);
	e2.setDept("Rahim");
	e2.setDept("HR");

	Employee e3 = new Employee();
	e3.setId(103);
	e3.setName("sara");
	e3.setDept("Finance");

	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	
	return empList;  
	

}

	public static void main(String[] args) {
		
		List<employee> emplist = addemployees();
         System.out.println(List<E>);
		

		
	}
}