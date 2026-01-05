package com.konic.java.offline.project1;

import java.util.*;



public class EmployeeService {
	
	private  List<Employee> employeeList = new ArrayList<>();
	
	private Map<Integer, Employee> employeeMap = new LinkedHashMap<>();
	
	
	public void addEmployees() {
		
		employeeList.add(new Employee(101, "Hussain","IT"));
		employeeList.add(new Employee(102, "Ali","HR"));
		employeeList.add(new Employee(103, "Sara","Finance" ));
		employeeList.add(new Employee(104, "John", "Admin"));
		employeeList.add(new Employee(101, "Hussain", "IT"));
		
		System.out.println("Employees Added");
		employeeList.forEach(System.out::println);
	}
	
	 public Set<Employee> removeDuplicateEmployees() {
	
	  Set<Employee> uniqueEmployees = new HashSet<>(employeeList);
      System.out.println("\nAfter Removing Duplicates:");
      uniqueEmployees.forEach(System.out::println);

      return uniqueEmployees;
      
	 }
	 
      public void sortEmployees() {

          Collections.sort(employeeList);
          System.out.println("\nSorted Employees (by ID):");
          employeeList.forEach(System.out::println);
      }
      
      public void storeInLinkedHashMap() {

          for (Employee e : employeeList) {
              employeeMap.put(e.getId(), e);
          }
          
          System.out.println("\nLinkedHashMap (Insertion Order):");
          employeeMap.forEach((k, v) -> System.out.println(v));
      }
     
      public void storeInTreeMap() {

          TreeMap<Integer, Employee> treeMap = new TreeMap<>(employeeMap);

          System.out.println("\nTreeMap (Sorted by Key):");
          treeMap.forEach((k, v) -> System.out.println(v));
      }
       
      public void getEmployeeById(int id) {

          Employee emp = employeeMap.get(id);
          System.out.println("\nEmployee with ID " + id + ": " + emp);
      }
      
      public void removeEmployeeSafely() {

          Iterator<Employee> it = employeeList.iterator();

          while (it.hasNext()) {
              Employee e = it.next();
              if (e.getId() == 102) {
                  it.remove();
              }
          }
          System.out.println("\nAfter Safe Removal:");
          employeeList.forEach(System.out::println);
       }
      
       
		
	}


