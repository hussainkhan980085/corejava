package com.konic.java.constructors;

public class cstudent {
	
	
   String name;
   int rollno;
   
   static String collegename;
   
   cstudent(String name,int rollno){
	   this.name=name;
	   this.rollno=rollno;
   }
	   
	   static void changeCollege(String cname) {
		  collegename = cname;
		  
	  }
    void display() {
    	System.out.println("college name:"+collegename);
    	System.out.println("student:"+name);
    	System.out.println("rollno:"+rollno);
    	
    }
   
   
	public static void main(String[] args) {
		
		cstudent.changeCollege("IIT Delhi");
	
		cstudent std=new cstudent("zara",12);
		std.display();
		

	}

}
