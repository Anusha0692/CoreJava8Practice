package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ComparatorExample{
	
	/*
	 * static List<Employee> empList = Arrays.asList(new Employee("Tom",25), new
	 * Employee("Jav",28), new Employee("Hello",32), new Employee("Hi",33), new
	 * Employee("Harry",25), new Employee("Cal",28), new Employee("Jack",23), new
	 * Employee("viv",32));
	 */
private static List<Employee> getEmployees(){
	List<Employee> empList = new ArrayList<Employee>();
	empList.add(new Employee("tom",25));
	empList.add(new Employee("Hi",29));
	empList.add(new Employee("Hope",36));
	empList.add(new Employee("mike",32));
	empList.add(new Employee("Joy",29));
	empList.add(new Employee("Happy",26));
	empList.add(new Employee("Meave",40));
	empList.add(new Employee("Yes",25));
	
	return empList;
}
	
public static void main(String[] args) {
	List<Employee> employeeList = getEmployees();
	System.out.println("Before sort ");
	 for (Employee emp :employeeList ) {
		 System.out.println(emp.getEmpName()+"="+emp.getEmpAge());
	 }
	 
	// Collections.sort(employeeList,new Comparator<Employee>() {

		//@Override
		//public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			//return o1.getEmpAge()- o2.getEmpAge();
		//}	
		
	//});
	 
	 System.out.println("After Sort ");
	 for (Employee emp :employeeList ) {
		 System.out.println(emp.getEmpName()+"="+emp.getEmpAge());
	 }
	 
	 System.out.println("Lamda Java8 After Sort ");
	 employeeList.sort((Employee e1, Employee e2)->e1.getEmpAge()-e2.getEmpAge()); 
	 employeeList.forEach((emp) -> System.out.println(emp.getEmpName()+"=="+emp.getEmpAge()));
	 
	 System.out.println("Lamda Java8 Number of employees with Same age ");
	 Map<Integer, Long> cardsMap = employeeList
	            .stream()
	            .collect(Collectors.groupingBy(Employee::getEmpAge, Collectors.counting()));
	 cardsMap.forEach((k,v)->System.out.println("Age: " + k + ", Name: " + v));
	 
	
	                                   
	 
	 
//	 Map<Integer, Long> cardsMap1 = employeeList
//	            .stream().filter(emp->emp.getEmpAge()>18)
//	            .map(emp->{
//	                  if(emp.getEmpName().equals(("dsfads")))
//	                		  {
//	                	  
//	                		  }
//	                  retun emp;
//	            }
//	            		
//	            		)
//	            .collect(toMap(emp.getAge(), emp.getName()));
//	 
//	 ArrayList<employee> cardsMap1 = employeeList
//	            .stream().filter(emp->emp.getEmpAge()>18)
//	            .map(emp->{
//	                  if(emp.getEmpName().equals(("dsfads")))
//	                		  {
//	                	  
//	                		  }
//	            }
//	            		
//	            		)
//	            .collect(Collectert.toList());
//	 
	 
}
}
