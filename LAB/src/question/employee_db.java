package question;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Connecting JDBC to SQL database
public class employee_db {
	    public static Connection connect() throws SQLException {
	        return DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Ludhiya@77");
	    }
	// add Employee to the database using INSERT with exception handling
	    public static void addEmployee(Employee emp) {
	        String sql = "INSERT INTO Employees(id,name, age, salary) VALUES (?, ?, ?, ?)";
	        try (Connection con = connect();
	            PreparedStatement st = con.prepareStatement(sql))
	            {
	        	st.setInt(1, emp.getId());
	            st.setString(2, emp.getName());
	            st.setInt(3, emp.getAge());
	            st.setDouble(4, emp.getSalary());
	            st.executeUpdate();
	            
	        } catch (SQLException e) {
	            System.out.println("Error adding employee: " + e.getMessage());
	        }
	    }
	// update salary in database 
	    public static void updateSalary(int id, double newSalary) {
	        String sql = "UPDATE Employees SET salary = ? WHERE id = ?";
	        try (Connection conn = connect(); PreparedStatement st = conn.prepareStatement(sql)) {
	            st.setDouble(1, newSalary);
	            st.setInt(2, id);
	            int rows = st.executeUpdate();
	            if (rows > 0) {
	                System.out.println("Salary updated successfully");
	            } else {
	                System.out.println("Employee ID not found");
	            }
	        } catch (SQLException e) {
	            System.out.println("Error updating salary: " + e.getMessage());
	        }
	    }
	// deleting employee details in database
	    public static void deleteEmployee(int id) {
	        String sql = "DELETE FROM Employees WHERE id = ?";
	        try (Connection conn = connect(); 
	        	PreparedStatement st = conn.prepareStatement(sql)) {
	            st.setInt(1, id);
	            int rows = st.executeUpdate();
	            if(rows > 0) {
	                System.out.println("Employee deleted successfully");
	            } else {
	                System.out.println("Employee ID not found");
	            }
	        } catch (SQLException e) {
	            System.out.println("Error deleting employee: " + e.getMessage());
	        }
	    }
	// File handling - saving files using Buffered writer 
	    private static void saveToFile(Employee emp) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt", true))) {
	            writer.write(emp.getId() + "," + emp.getName() + "," + emp.getAge() + "," + emp.getSalary());
	            writer.newLine();
	        } catch (IOException e) {
	            System.out.println("Error saving to file: " + e.getMessage());
	        }
	    }
	// display all details
	    public static void displayAllDetails() {
	        String sql = "SELECT * FROM Employees";
	        try (Connection conn = connect();
	             PreparedStatement st = conn.prepareStatement(sql);
	        		// execute
	             ResultSet rs = st.executeQuery(sql)) {
	            while (rs.next()) {
	                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age") + ", Salary: " + rs.getDouble("salary"));
	            }
	        } catch (SQLException e) {
	            System.out.println("Error displaying employees: " + e.getMessage());
	        }
	    }
	// display all employees
	    public static void displayEmployeeByID(int searchId) {
	        String sql = "SELECT * FROM Employees WHERE id = ?";
	        try (Connection conn = connect(); 
	        	PreparedStatement st = conn.prepareStatement(sql)) {
	            st.setInt(1, searchId);
	            ResultSet rs = st.executeQuery();
	            if (rs.next()) {
	                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age") + ", Salary: " + rs.getDouble("salary"));
	            } else {
	                System.out.println("Employee not found");
	            }
	        } catch (SQLException e) {
	            System.out.println("Error displaying employee: " + e.getMessage());
	        }
	    }
	}

