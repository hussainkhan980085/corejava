package com.konic.java.map;

public class employee {
	

	    private int id;
	    private String name;
	    private String dept;

	    
	    
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		//----- Display format
	    public String toString() {
	        return id + "-" + name + "-" + dept;
	    }

		
	}



