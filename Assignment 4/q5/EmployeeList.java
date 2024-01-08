package q5;
import java.util.Scanner;

public class EmployeeList {
    private class EmployeeNode {
        private Employee employee;
        private EmployeeNode next;

        public EmployeeNode(Employee employee) {
            this.employee = employee;
            this.next = null;
        }
    }

    private EmployeeNode head;

    public void addEmployee(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void displayAllEmployees() {
        if (head == null) {
            System.out.println("No employees in the list.");
        } else {
            EmployeeNode trav = head;
            while (trav != null) {
                System.out.println(trav.employee);
                trav = trav.next;
            }
        }
    }

    public void searchEmployeeByName(String name) {
        if (head == null) {
            System.out.println("No employees in the list.");
        } else {
            EmployeeNode trav = head;
            while (trav != null) {
                if (trav.employee.getEmpName().equalsIgnoreCase(name)) {
                    System.out.println("Employee found: " + trav.employee);
                    return;
                }
                trav = trav.next;
            }

            System.out.println("Employee with name " + name + " not found.");
        }
    }

    public void deleteEmployeeById(int empId) {
        if (head == null) {
            System.out.println("No employees in the list.");
            return;
        }

        if (head.employee.getEmpId() == empId) {
            head = head.next;
            System.out.println("Employee with ID " + empId + " deleted successfully.");
            return;
        }

        EmployeeNode trav = head;

        while (trav.next != null && trav.next.employee.getEmpId() != empId) {
            trav = trav.next;
        }

        if (trav.next != null) {
            trav.next = trav.next.next;
            System.out.println("Employee with ID " + empId + " deleted successfully.");
        } else {
            System.out.println("Employee with ID " + empId + " not found.");
        }
    }

    public void updateEmployeeSalary(int empId, double newSalary) {
        if (head == null) {
            System.out.println("No employees in the list.");
            return;
        }

        EmployeeNode trav = head;

        while (trav != null && trav.employee.getEmpId() != empId) {
            trav = trav.next;
        }

        if (trav != null) {
            trav.employee.setEmpSalary(newSalary);
            System.out.println("Salary of Employee with ID " + empId + " updated successfully.");
        } else {
            System.out.println("Employee with ID " + empId + " not found.");
        }
    }
}

