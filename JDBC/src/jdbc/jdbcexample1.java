package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class jdbcexample1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ArrayList<jdbc> sc = new ArrayList<>();
		//step 1. load jdbc the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		// step 2. Establish the connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1","root","Ludhiya@77");
		System.out.println("Connection created");
				
		//to insert 
//		PreparedStatement p = c.prepareStatement("insert into employee1(?,?,?)");
//		p.setInt(1,3);
//		p.setString(2, "rupan");
//		p.setInt(3,60000);
//		
		//to update
		PreparedStatement p = c.prepareStatement("update java1 set salary = ? where id=?");
		p.setInt(3,9000);
		p.setInt(1, 2);
		
		//create query
		Statement s = c.createStatement();
				
		//execute query
		ResultSet rs = s.executeQuery("select * from employee1");
				
		//print data
		while(rs.next())
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				
		//close the connection
		c.close();
				
	}

}
