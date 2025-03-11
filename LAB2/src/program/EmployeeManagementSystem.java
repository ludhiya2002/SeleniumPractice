package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/company_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Ludhiya@77";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            String employeeId = getUniqueEmployeeId(scanner, employees);
            String name = getInput(scanner, "Name: ");
            int age = getValidAge(scanner);
            String department = getInput(scanner, "Department: ");
            String jobRole = getInput(scanner, "Job Role: ");
            double salary = getValidSalary(scanner);
            List<Double> performanceRatings = getValidPerformanceRatings(scanner);

            employee employee = new employee(employeeId, name, age, department, jobRole, salary, performanceRatings);
            employees.add(employee);
        }

        // Write to file
        writeToFile(employees);

        // Store in database
        storeInDatabase(employees);

        // Display statistics
        displayStatistics(employees);
    }

    private static String getUniqueEmployeeId(Scanner scanner, List<employee> employees) {
        while (true) {
            System.out.print("Employee ID: ");
            String id = scanner.nextLine();
            if (employees.stream().noneMatch(e -> e.getEmployeeId().equals(id))) {
                return id;
            }
            System.out.println("Employee ID already exists. Please enter a unique ID.");
        }
    }

    private static int getValidAge(Scanner scanner) {
        while (true) {
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age >= 18 && age <= 65) {
                return age;
            }
            System.out.println("Invalid age. Age must be between 18 and 65.");
        }
    }

    private static double getValidSalary(Scanner scanner) {
        while (true) {
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            if (salary > 0) {
                return salary;
            }
            System.out.println("Invalid salary. Salary must be a positive number.");
        }
    }

    private static List<Double> getValidPerformanceRatings(Scanner scanner) {
        List<Double> ratings = new ArrayList<>();
        System.out.print("Enter number of performance ratings: ");
        int numRatings = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numRatings; i++) {
            while (true) {
                System.out.print("Rating " + (i + 1) + ": ");
                double rating = scanner.nextDouble();
                scanner.nextLine();
                if (rating >= 0 && rating <= 100) {
                    ratings.add(rating);
                    break;
                }
                System.out.println("Invalid rating. Rating must be between 0 and 100.");
            }
        }
        return ratings;
    }

    private static String getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static void writeToFile(List<employee> employees) {
        try (PrintWriter writer = new PrintWriter(new File("employees.txt"))) {
            for (employee emp : employees) {
                writer.println(emp);
            }
            System.out.println("\nEmployee details written to employees.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void storeInDatabase(List<employee> employees) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO employees (employee_id, name, age, department, job_role, salary, avg_rating) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(sql);

            for (employee emp : employees) {
                st.setString(1, emp.getEmployeeId());
                st.setString(2, emp.getName());
                st.setInt(3, emp.getAge());
                st.setString(4, emp.getDepartment());
                st.setString(5, emp.getJobRole());
                st.setDouble(6, emp.getSalary());
                st.setDouble(7, emp.getAveragePerformanceRating());
                st.executeUpdate();
            }
            System.out.println("Employee details stored in database.");
        } catch (SQLException e) {
            System.out.println("Error storing data in database: " + e.getMessage());
        }
    }

    private static void displayStatistics(List<employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        double maxSalary = getMaxSalary(employees);
        double minSalary = getMinSalary(employees);
        double avgSalary = getAverageSalary(employees);

        double maxRating = getMaxRating(employees);
        double minRating = getMinRating(employees);
        double avgRating = getAverageRating(employees);

        System.out.println("\nEmployee Statistics:");
        System.out.println("Highest Salary: " + maxSalary);
        System.out.println("Lowest Salary: " + minSalary);
        System.out.println("Average Salary: " + avgSalary);
        System.out.println("Highest Performance Rating: " + maxRating);
        System.out.println("Lowest Performance Rating: " + minRating);
        System.out.println("Average Performance Rating: " + avgRating);

        System.out.println("\nHigh Achievers:");
        employees.stream()
                .filter(employee::isHighPerformer)
                .forEach(emp -> System.out.println(emp.getName() + " - " + emp.getJobRole() + " - Avg Rating: " + emp.getAveragePerformanceRating()));

        System.out.println("\nDepartment-wise High Performers:");
        Map<String, Long> highPerformersByDept = employees.stream()
                .filter(employee::isHighPerformer)
                .collect(Collectors.groupingBy(employee::getDepartment, Collectors.counting()));
        highPerformersByDept.forEach((dept, count) -> System.out.println(dept + ": " + count));
    }

    // Helper methods for statistics
    private static double getMaxSalary(List<employee> employees) {
        return employees.stream().mapToDouble(employee::getSalary).max().orElse(0);
    }

    private static double getMinSalary(List<employee> employees) {
        return employees.stream().mapToDouble(employee::getSalary).min().orElse(0);
    }

    private static double getAverageSalary(List<employee> employees) {
        return employees.stream().mapToDouble(employee::getSalary).average().orElse(0);
    }

    private static double getMaxRating(List<employee> employees) {
        return employees.stream().mapToDouble(employee::getAveragePerformanceRating).max().orElse(0);
    }

    private static double getMinRating(List<employee> employees) {
        return employees.stream().mapToDouble(employee::getAveragePerformanceRating).min().orElse(0);
    }

    private static double getAverageRating(List<employee> employees) {
        return employees.stream().mapToDouble(employee::getAveragePerformanceRating).average().orElse(0);
    }
}