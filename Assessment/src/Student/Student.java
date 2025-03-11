package Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Student {
	    private String studentID;
	    private String name;
	    private int age;
	    private String department;
	    private Map<String, Integer> subjects;

	    public Student(String studentID, String name, int age, String department, Map<String, Integer> subjects) {
	        this.studentID = studentID;
	        this.name = name;
	        this.age = age;
	        this.department = department;
	        this.subjects = subjects;
	    }

	    public String getStudentID() { return studentID; }
	    public void setStudentID(String studentID) { this.studentID = studentID; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public int getAge() { return age; }
	    public void setAge(int age) { this.age = age; }

	    public String getDepartment() { return department; }
	    public void setDepartment(String department) { this.department = department; }

	    public Map<String, Integer> getSubjects() { return subjects; }
	    public void setSubjects(Map<String, Integer> subjects) { this.subjects = subjects; }

	    // Calculate Average Grade using a Loop
	    public double getAverageGrade() {
	        if (subjects.isEmpty()) return 0;
	        int sum = 0;
	        for (int grade : subjects.values()) {
	            sum += grade;
	        }
	        return (double) sum / subjects.size();
	    }

	    // Check if Student has Passed (Using Loop)
	    public boolean hasPassed() {
	        for (int grade : subjects.values()) {
	            if (grade < 40) return false;
	        }
	        return true;
	    }

	    // Check if Student is a High Achiever (Using Loop)
	    public boolean isHighAchiever() {
	        for (int grade : subjects.values()) {
	            if (grade <= 85) return false;
	        }
	        return true;
	    }
}

