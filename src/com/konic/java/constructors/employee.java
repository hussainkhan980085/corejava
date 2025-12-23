package com.konic.java.constructors;

public class employee {
	
	String name;
	int salary;
	
	employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}

	int yearlysalary() {
		return salary*12;
	}
	
	
	void display() {
		System.out.println("employee:"+name);
		System.out.println("monthlysalary:"+salary);
		System.out.println("yearlysalary:"+yearlysalary());
	}
	public static void main(String[] args) {
		
		employee emp = new employee("Aisha",30000);
		emp.display();
		

	}

}
