package question;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Student implements Serializable{
	int rollNumber;
	String name;
	Map<String,Integer> subjects;
	
	Student(int rollNumber,String name){
		this.rollNumber=rollNumber;
		this.name=name;
		this.subjects = new HashMap<>();
	}
	public void addSubject(String subject,int marks) {
		subjects.put(subject, marks);
	}
	public void displayStudentDetail() {
		System.out.println("Roll Number:" + rollNumber);
		System.out.println("Name:"+name);
		System.out.println("Subject & Marks:"+subjects);
	}
	@Override
	public String toString() {
		return "Student{rollNumber="+rollNumber+",name="+name+" ,subjects="+subjects+"}";
		
	}

}
