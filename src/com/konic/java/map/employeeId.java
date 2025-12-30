package com.konic.java.map;

public class employeeId {

	

	    private int id;
	    private String name;
	    private String dept;

	    public employeeId(int id, String name, String dept) {
	        this.id = id;
	        this.name = name;
	        this.dept = dept;
	    }

	    // Getters only
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDept() {
	        return dept;
	    }

	    @Override
	    public String toString() {
	        return id + "-" + name + "-" + dept;
	    }
	}

	

