package Example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class example1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1,"Hello",123));
		emp.add(new Employee(2,"Welcome",345));
		emp.add(new Employee(3,"Java Programming",678));
		
		// Serialization - converts object into byte code
		FileOutputStream fo = new FileOutputStream("employee.txt");
		ObjectOutputStream out = new ObjectOutputStream(fo);
		out.writeObject(emp);
		out.close();
		fo.close();
		System.out.println("Written in a file");
		
		//De Serialization - converts byte code into object
		FileInputStream fi = new FileInputStream("employee.txt");
		ObjectInputStream in = new ObjectInputStream(fi);
		ArrayList<Employee> s = (ArrayList<Employee>) in.readObject();
		in.close();
		fi.close();
		System.out.println("Reading the file");
		for(Employee e : s ) {
			System.out.println(e.id+" "+e.name+" "+e.salary);
		}
		
	}
}