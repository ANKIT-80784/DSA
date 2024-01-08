package q5;

import java.util.Scanner;

public class EmployeeListTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeList employeeList = new EmployeeList();

        int choice;

        do {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by Employee ID");
            System.out.println("5. Update Salary of Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.print("Enter Employee Name: ");
                    String empName = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double empSalary = scanner.nextDouble();

                    Employee employee = new Employee(empId, empName, empSalary);
                    employeeList.addEmployee(employee);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    employeeList.displayAllEmployees();
                    break;

                case 3:
                    scanner.nextLine(); // consume the newline
                    System.out.print("Enter Employee Name to Search: ");
                    String searchName = scanner.nextLine();
                    employeeList.searchEmployeeByName(searchName);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteEmpId = scanner.nextInt();
                    employeeList.deleteEmployeeById(deleteEmpId);
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    int updateEmpId = scanner.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();
                    employeeList.updateEmployeeSalary(updateEmpId, newSalary);
                    break;

                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
