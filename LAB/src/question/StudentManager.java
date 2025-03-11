package question;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	private List<Student> students;
	
	public StudentManager() {
		students = new ArrayList<>();
	}
	//Add Student
	public void addStudent(Student student) {
		students.add(student);
	}
	//remove Student
	public void removeStudent(int rollNumber) {
		students.removeIf(student -> student.rollNumber == rollNumber);
		
	}
	//search student by name
	public Student searchStudentByName(String name) {
		for(Student student : students) {
			if(student.name.equalsIgnoreCase(name)) {
				return student;
			}
		}
		return null;
	}
	//display all students
	public void displayAllStudents() {
		for(Student student : students) {
			System.out.println(student);
		}
	}
	public void saveToFile(String filename) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
			out.writeObject(students);
			System.out.println("Students saved successfully");
		}
		
	}
	public void loadFromFile(String filename) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
			students = (ArrayList<Student>) in.readObject();
			System.out.println("Students loaded successfully");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error loading data");
		}
		
	}

}
