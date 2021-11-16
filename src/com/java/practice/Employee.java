package com.java.practice;

public class Employee {

	private String empName;
	private int empAge;
	
	public Employee(String empName, int empAge) {
		super();
		this.empName = empName;
		this.empAge = empAge;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	public int compare(Employee emp1, Employee emp2) {
	    return (emp1.getEmpName().compareTo(emp2.getEmpName()));
}
}
