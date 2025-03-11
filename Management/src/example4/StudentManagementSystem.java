package example4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
	private static ArrayList<Student> students = new ArrayList<>();
	private static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		StudentManagementSystem s = new StudentManagementSystem();
		s.details();
	}

	private void details() {
		while(true) {
			System.out.println("1.Add Student");
			System.out.println("2.View Student");
			System.out.println("3.Delete Student");
			System.out.println("4.Update Marks");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			int  choice = sc.nextInt();
			switch(choice) {
			case 1:
				addStudent();
				break;
			case 2:
				viewStudent();
				break;
			case 3:
				deleteStudent();
				break;
			case 4:
				updateMarks();
				break;
			case 5:
				System.out.println("Exiting");
				System.exit(0);
			default:
				System.out.println("Invalid choice.Please try again");
			}
		}

	}
	private void addStudent() {
		System.out.print("Enter Student ID:");
		int id = sc.nextInt();
		
		System.out.println("Enter Student name:");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Marks:");
		int marks = sc.nextInt();
		sc.nextLine();
		
		students.add(new Student(id,name,marks));
		System.out.println("Students added successfully");
		
	}
	private void viewStudent() {
		if(students.isEmpty()) {
			System.out.println("No students available");
			return;
		}
		System.out.println("\nStudent list:");
		for(Student stu : students) {
			System.out.println("ID:"+stu.id+",Name:"+stu.name+",Marks:"+stu.marks);
		}
		
	}
	private void deleteStudent() {
		System.out.println("Enter Student ID to delete:");
		while(!sc.hasNextInt()) {
			System.out.println("Inavlid input.Please enter a valid integer:");
		}
		int id = sc.nextInt();
		sc.nextLine();
		for(Student s : students) {
			if(s.id ==id) {
				System.out.println("Student deleted successfully");
				return;
			}
		}
	System.out.println("Student not found");
	
}
private void updateMarks() {
	System.out.println("Enter Student ID to update marks:");
	while(!sc.hasNextInt()) {
		System.out.println("Invalid input.Please enter a valid integer:");
		sc.next();
	}
	int id = sc.nextInt();
	for(Student s : students) {
		if(s.id == id) {
			System.out.println("Enter new marks:");
			s.marks = sc.nextInt();
			System.out.println("Marks updated successfully");
			return;
		}
	}
	System.out.println("Student not found");
}
}
