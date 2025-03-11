package question;

public class HighSchoolStudent extends Student{
	// adds : gradeLevel
	private int gradeLevel;

	public HighSchoolStudent(int rollNumber, String name, int gradeLevel) {
		super(rollNumber, name);
		this.gradeLevel = gradeLevel;
		
	}
	@Override
	public String toString() {
		return "HighSchoolStudent{rollNumber='"+rollNumber+",name="+name+",gradeLevel="+gradeLevel+",+subjects="+subjects+"}";
		
	}
	
	
}

