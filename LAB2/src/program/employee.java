package program;

import java.util.List;

public class employee{
	    private String employeeId;
	    private String name;
	    private int age;
	    private String department;
	    private String jobRole;
	    private double salary;
	    private List<Double> performanceRatings;

	    public employee(String employeeId, String name, int age, String department, String jobRole, double salary, List<Double> performanceRatings) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.age = age;
	        this.department = department;
	        this.jobRole = jobRole;
	        this.salary = salary;
	        this.performanceRatings = performanceRatings;
	    }

	    // Getters and Setters
	    public String getEmployeeId() {
	    	return employeeId; 
	    }
	    public String getName() { 
	    	return name; 
	    }
	    public int getAge() { 
	    	return age; 
	    }
	    public String getDepartment() { 
	    	return department; 
	    }
	    public String getJobRole() { 
	    	return jobRole; 
	    }
	    public double getSalary() { 
	    	return salary; 
	    }
	    public List<Double> getPerformanceRatings() { 
	    	return performanceRatings; 
	    }

	    // Calculate average performance rating
	    public double getAveragePerformanceRating() {
	        return performanceRatings.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
	    }

	    // Check if employee is a high performer
	    public boolean isHighPerformer() {
	        return getAveragePerformanceRating() >= 85;
	    }

	    @Override
	    public String toString() {
	        return String.format("ID: %s, Name: %s, Age: %d, Department: %s, Job Role: %s, Salary: %.2f, Avg Rating: %.2f",
	                employeeId, name, age, department, jobRole, salary, getAveragePerformanceRating());
	    }
	}

	