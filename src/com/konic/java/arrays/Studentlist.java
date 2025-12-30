package com.konic.java.arrays;
 
import java.util.ArrayList;
import java.util.List;

public class Studentlist {
	  
    public static List<String> addStudents() {
        List<String> students = new ArrayList<>();

        students.add("Ayaan");
        students.add("Rahim");
        students.add("Sara");
        students.add("John");
        students.add("Ali");
        students.add("khan");
     
        return students; 
		 
	 
	
	
	
    }
	public static void main(String[] args) {
		 List<String> students = addStudents();
	        System.out.println("Students: " + students);
	    }
   
	}


