package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import collections.Customer;

public class CustomerDAO extends DatabaseConnection{
	public void addCustomer(Customer customer) {
		String query = "INSERT INTO customers(name,email,phone) VALUES(?,?,?)";
		try(Connection con = getConnection();
				PreparedStatement st = con.prepareStatement(query)){
			st.setString(1, customer.getName());
			st.setString(2, customer.getEmail());
			st.setString(3, customer.getPhone());
			st.executeUpdate();
			System.out.println("Customers added successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void displayCustomers() throws SQLException {
		String query = "SELECT * FROM customers";
		try(Connection con = getConnection();
				PreparedStatement st = con.prepareStatement(query);
				ResultSet rs = st.executeQuery()){
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getString("name") + "|"+rs.getString("email")+"|" + rs.getString("phone"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}

