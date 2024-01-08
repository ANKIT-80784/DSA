package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpSortBySlry {
	
	public static void printEmpList(List<Employee> employees)
	{
		for (Employee employee : employees) {
			System.out.println("Employee Name: "+employee.getName() + ", Salary : "+employee.getSalary());
		}
	}
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Ankit",65000.0));
		employees.add(new Employee("Ankita", 75000.0));
		employees.add(new Employee("Siddhant", 550000.0));
		
		System.out.println("Original List : ");
		printEmpList(employees);
		
		Collections.sort(employees, Comparator.comparing(Employee::getSalary));
		System.out.println("\nSorted List by salary in Ascending Order : ");
		printEmpList(employees);
		
		
	}

}
