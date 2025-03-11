package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcexample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//step 1. load jdbc the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step 2. Establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Ludhiya@77");
		System.out.println("Connection created");
		
		//create query
		Statement s = c.createStatement();
		
		//execute query
		ResultSet rs = s.executeQuery("select * from students");
		
		//print data
		while(rs.next())
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		
		//close the connection
		c.close();
		
	}
}
