package com.konic.java.offline.project1;
import java.util.Objects;

public class Employee extends BasePerson implements Comparable<Employee> {

    private String department;  

    private static final String COMPANY_NAME = "Konic Technologies";

    public Employee(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public static String getCompanyName() {
        return COMPANY_NAME;
    }

    public int compareTo(Employee e) {
        return this.id - e.id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee emp = (Employee) o;
        return id == emp.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " | " + name + " | " + department;
    }
}

	
	
	
	
	


