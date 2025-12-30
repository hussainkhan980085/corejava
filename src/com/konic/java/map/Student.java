package com.konic.java.map;

import java.util.HashMap;
import java.util.Map;

import com.koni.java.overloading.studentRegisteration;
import com.konic.java.arrays.Studentlist;


public class Student {
	
	int Rollno;
	String Name;
	int Marks;
	
 
	public int getRollno() {
		return Rollno;
	}
	
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}
	
	public void tostring() {
		
	}

	public static void main(String[] args) {
		
		Map<Integer,Student> s1 = new HashMap<>(); /// object of map....
		
		Student s = new Student(); /// object of student...
	
		s.setRollno(10);
		s.setName("hussain khan");
		s.setMarks(500);
		
        Student S2 =new Student();
        S2.setMarks(1000);
        S2.setName("Hassin khan");
        S2.setRollno(11);
		
		s1.put(101,s);
		s1.put(102,S2);
		
		System.out.println(s1.get(101));
		System.out.println(s1.get(102));
		
		
		
		
		
		

	}

}
