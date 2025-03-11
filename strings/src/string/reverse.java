package string;

public class reverse {

	public static void main(String[] args) {
		// String bulider and String Buffer
		String s ="Java Programming";
		//System.out.println("Enter the string:");
		StringBuilder sb = new StringBuilder(s);
		StringBuffer st = new StringBuffer(s);
		sb.append(". Appended words");
		//sb.reverse();
		System.out.println(sb);
		
		

	}

}
