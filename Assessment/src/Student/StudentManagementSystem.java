package Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementSystem {
	private static final String FILE_NAME = "students.txt";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/college";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "Ludhiya@77";

    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadStudentsFromFile();

        while (true) {
            System.out.println("\n1. Add Student\n2. Display All Students\n3. Search Student\n4. Save to File\n5. Save to Database\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    saveToFile();
                    break;
                case 5:
                    saveToDatabase();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        try {
            System.out.print("Enter Student ID: ");
            String studentID = scanner.nextLine();
            if (students.stream().anyMatch(s -> s.getStudentID().equals(studentID))) {
                throw new IllegalArgumentException("Student ID must be unique!");
            }

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age (17-30): ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            if (age < 17 || age > 30) {
                throw new IllegalArgumentException("Age must be between 17 and 30!");
            }

            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            Map<String, Integer> subjects = new HashMap<>();
            System.out.print("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter Subject Name: ");
                String subject = scanner.nextLine();

                System.out.print("Enter Grade (0-100): ");
                int grade = scanner.nextInt();
                scanner.nextLine();
                if (grade < 0 || grade > 100) {
                    throw new IllegalArgumentException("Grade must be between 0 and 100!");
                }
                subjects.put(subject, grade);
            }

            Student student = new Student(studentID, name, age, department, subjects);
            students.add(student);
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void displayAllStudents() {
        System.out.println("\nAll Students:");
        for (Student student : students) {
            System.out.println(student);
            System.out.println("Pass Status: " + (student.hasPassed() ? "Pass" : "Fail"));
        }
    }

    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter Student ID or Name: ");
        String searchQuery = scanner.nextLine();
        for (Student student : students) {
            if (student.getStudentID().equalsIgnoreCase(searchQuery) || student.getName().equalsIgnoreCase(searchQuery)) {
                System.out.println("Found: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }
    private static void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
        }
    }

    private static void loadStudentsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Loaded: " + line);
            }
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }
    }
    private static void saveToDatabase() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO students (id, name, age, department, average_grade) VALUES (?, ?, ?, ?, ?)")) {

            for (Student student : students) {
                stmt.setString(1, student.getStudentID());
                stmt.setString(2, student.getName());
                stmt.setInt(3, student.getAge());
                stmt.setString(4, student.getDepartment());
                stmt.setDouble(5, student.getAverageGrade());
                stmt.executeUpdate();
            }
            System.out.println("Data saved to database.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}




	
