package Example;

import java.util.Comparator;

public class Student3 implements Comparator<Student>{
	@Override
	public int compare(Student stu1, Student stu2) {
		return Integer.compare(stu1.id,stu2.id);
	}

}
