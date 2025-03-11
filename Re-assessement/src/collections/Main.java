package collections;

import collections.*;
import jdbc.*;
import Filehandling.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		GroceryStore store = new GroceryStore();
		
		
		store.addProduct(new product(1,"Washing Machine","Home applicanes",1.5, 50));
		store.addCustomer(new Customer(1,"Ludhiya","ludhiya8008@gmail.com", "123456789"));
		
		store.displayProducts();
		store.displayCustomers();
		
		ProductDAO productDAO = new ProductDAO();
		productDAO.addProduct(new product(0,"Face Wash","Beauty",0.75,100));
		productDAO.displayProducts();
		//new product(0,"Face Wash","Beauty",0.75,100).toString();
		System.err.println(new product(0,"Face Wash","Beauty",0.75,100).toString());
		FileManager.writeCustomerToFile(Arrays.asList(new Customer(2,"Sampath","sampathkumar786@gmail.com","0987654321")));
		FileManager.readCustomersFromFile().forEach(System.out::println);

	}

}
