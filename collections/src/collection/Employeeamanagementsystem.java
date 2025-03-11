package collection;

import java.util.ArrayList;
import java.util.Scanner;

//constructor
class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
//   @Override
//    public String toString() {
//        return "ID: " + id + ", Name: " + name + ", Salary: $" + salary;
//    }
}
//user input
public class Employeeamanagementsystem {
    private ArrayList<Employee> employees = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Employeeamanagementsystem ems = new Employeeamanagementsystem();
        ems.run();
    }

    private void run() {
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Search Employee by ID");
            System.out.println("5. Update Employee Salary");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    displayEmployees();
                    break;
                case 4:
                    searchEmployee();
                    break;
                case 5:
                    updateSalary();
                    break;
                case 6:
                    System.out.println("Exiting Employee Management System...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        employees.add(new Employee(id, name, salary));
        System.out.println("Employee added successfully.");
    }

    private void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = scanner.nextInt();

        for (Employee employee : employees) {
            if (employee.id == id) {
                employees.remove(employee);
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    private void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            System.out.println("\nEmployee List:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    private void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        int id = scanner.nextInt();

        for (Employee employee : employees) {
            if (employee.id == id) {
                System.out.println("Employee Found: " + employee);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    private void updateSalary() {
        System.out.print("Enter Employee ID to update salary: ");
        int id = scanner.nextInt();

        for (Employee employee : employees) {
            if (employee.id == id) {
                System.out.print("Enter new salary: ");
                employee.salary = scanner.nextDouble();
                System.out.println("Salary updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found!");
    }
}
