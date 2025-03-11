package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class example1 {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int ch = 1;
		int id;
		String name;
		int salary;

	switch(ch) {
	case 1:
		System.out.println("Enter employee details:");
	    id = sc.nextInt();
		name = sc.next();
		salary = sc.nextInt();
		emp.add(new Employee(id,name,salary));
		break;
		
	case 2:
		System.out.println("Remove employee name:");
		int remove = sc.nextInt();
		for(Employee e:emp) {
			if(e.id==remove) {
				emp.remove(remove);
			}
		}
		break;
		
	case 3:
		System.out.println("Search employee name:");
		int search = sc.nextInt();
		for(Employee e:emp) {
			if(e.id==search) {
				System.out.println(emp);
			}
		}
		break;
		
	case 4:
		System.out.println("Display employees");
		for(Employee e:emp) {
			System.out.println(emp);
		break;
		}
	case 5:
		System.out.println("Update employee");
		int update = sc.nextInt();
		for(Employee e:emp) {
			if(e.id==update) {
				System.out.println("Enter new salary");
				e.salary = sc.nextInt();
				System.out.println("Salary updated successfully");
		        break;
			}
		}
	}
	}
}
