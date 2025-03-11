package Filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import collections.Customer;

public class FileManager {
	private static final String file_name = "customer_obj";
	public static void writeCustomerToFile(List<Customer> customers) throws FileNotFoundException, IOException {
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file_name))){
			os.writeObject(customers);;
			System.out.println("Customer data saved to file");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static List<Customer> readCustomersFromFile() throws ClassNotFoundException{
		List<Customer>customers = new ArrayList<>();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file_name))){
			ois.readObject();
			System.out.println("Customer data loaded from file");
		}catch(IOException e) {
			e.printStackTrace();
		}
		return customers;
	}

}

