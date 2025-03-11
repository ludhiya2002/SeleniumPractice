package question;

import java.io.IOException;
import java.util.Scanner;

public class StudentManagementSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display all Students");
            System.out.println("4. Save Students to File");
            System.out.println("5. Load Students from File");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter roll number: ");
                        int rollNumber = scanner.nextInt();
                        scanner.nextLine();
                        
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        
                        System.out.print("Enter grade level: ");
                        int gradeLevel = scanner.nextInt();
                        scanner.nextLine();
                        
                        HighSchoolStudent student = new HighSchoolStudent(rollNumber, name, gradeLevel);

                        while (true) {
                            System.out.print("Enter subject name:");
                            String subject = scanner.nextLine();
                            if (subject.equalsIgnoreCase("done")) 
                            break;
                            
                            System.out.print("Enter marks: ");
                            int marks = scanner.nextInt();
                            scanner.nextLine();
                            
                            student.addSubject(subject, marks);
                        }
                        manager.addStudent(student);
                        System.out.println("Student added successfully!");
                        break;

                    case 2:
                        System.out.print("Enter roll number to remove: ");
                        int removeRoll = scanner.nextInt();
                        manager.removeStudent(removeRoll);
                        System.out.println("Student removed successfully!");
                        break;

                    case 3:
                        manager.displayAllStudents();
                        break;

                    case 4:
                        manager.saveToFile("students.txt");
                        System.out.println("Students saved to file successfully!");
                        break;

                    case 5:
                        manager.loadFromFile("students.txt");
                        System.out.println("Students loaded from file successfully!");
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
        }
    }
}
