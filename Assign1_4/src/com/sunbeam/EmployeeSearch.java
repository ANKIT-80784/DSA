package com.sunbeam;

import java.util.Scanner;

public class EmployeeSearch {
	
	public static void main(String[] args) {
		
		// Create an Array of the Employees.
		Employee employees[] = 
			{
				new Employee(1, "Ankit", 500000.0),
				new Employee(2, "Ankita", 600000.0),
				new Employee(3, "Dhanraj", 400000.0),
				new Employee(4, "Jitendra", 4500000.0),
				new Employee(5, "Lokesh", 5500000.0),
				new Employee(6, "Aditya", 530000.0)
			
				// You can add more employee as needed.	
		};
		
		Scanner sc = new Scanner(System.in);
		// Search By Employee ID
		System.out.println("Enter Employee ID to be Searched : ");
		int searchEmpID = sc.nextInt();
		Employee foundById = searchEmployeeById(employees, searchEmpID);
		if (foundById != null) 
		{
			System.out.println("Employee Found : " + foundById.getName());
		}
		else
		{
			System.out.println("Employee with Id : " +searchEmpID + " not Found");
		}
		
		// Searching By Employee Name
		System.out.println("Enter Employee Name to be Searched : ");
		String searchName = sc.next();
		Employee foundByName = searchEmployeeByName(employees, searchName);
		if (foundByName != null) {
			System.out.println("Employee Found : " + foundByName.getName());
		}
		else
		{
			System.out.println("Employee with name : " + searchName + " Not found");
		}
		
		// Searching by Employee Salary
		System.out.println("Enter Employee Salary to be Searched  : ");
		double searchBySalary = sc.nextDouble();
		Employee foundBySalary = searchEmployeeBySalary(employees, searchBySalary);
		if (foundBySalary != null) {
			System.out.println("Employee found : " + foundBySalary.getSalary());
		}
		else
		{
			System.out.println("Employee with Salary : " + searchBySalary + " Not Found");
		}
		
	}
	
	public static Employee searchEmployeeById(Employee[] employees, int empId)
	{
		for (Employee employee : employees) {
			if (employee.getEmpid() == empId) {
				return employee;
			}
		}
		return null;	
	}
	
	public static Employee searchEmployeeByName(Employee[] employees, String name)
	{
		for (Employee employee : employees) {
			if (employee.getName().equalsIgnoreCase(name)){
				return employee;
			}
			
		}
		return null;	
	}
	
	public static Employee searchEmployeeBySalary(Employee[] employees, double salary)
	{
		for (Employee employee : employees) {
			if (employee.getSalary() == salary) {
				return employee;
			}
		}
		return null;
		
	}
	

}
