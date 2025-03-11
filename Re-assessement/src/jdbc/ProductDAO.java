package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import collections.product;

	public class ProductDAO extends DatabaseConnection{
		public void addProduct(product product) {
			String query = "INSERT INTO products(name,category,price,quantity) VALUES(?,?,?,?)";
			try(Connection con = getConnection();
					PreparedStatement st = con.prepareStatement(query)){
				st.setString(1,product.getName());
				st.setString(2,product.getCategory());
				st.setDouble(3,product.getPrice());
				st.setInt(4,product.getQuantity());
				st.executeUpdate();
				System.out.println("Product added successfully");
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void displayProducts() {
			String query = "SELECT * FROM products";
			try(Connection con = getConnection();
					PreparedStatement st = con.prepareStatement(query);
					ResultSet rs = st.executeQuery()){
				while(rs.next()) {
					System.out.println(rs.getInt("id")+"|"+rs.getString("name") + "|"+ rs.getString("category")+"|"+rs.getDouble("price")+"|"+rs.getInt("quantity"));
				}
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

