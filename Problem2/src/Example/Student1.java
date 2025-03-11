package Example;

import java.util.ArrayList;
import java.util.Collections;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> s = new ArrayList<>();
		s.add(new Student(1,"Purushotham",123));
		s.add(new Student(2,"Neelamma",345));
		s.add(new Student(3,"Ludhiya",678));
		
		Collections.sort(s,new Student3());
		System.out.println("Student sorting by ID:");
		for(Student stu : s) {
			System.out.println(stu.id+" "+stu.name+""+stu.marks);
		}
		
		Collections.sort(s,new NameCompare());
		System.out.println("Student sorting by name:");
		for(Student stu : s) {
			System.out.println(stu.id+" "+stu.name+" "+stu.marks);
		}
	}

}
