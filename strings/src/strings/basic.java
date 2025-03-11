package strings;

public class basic {

	public static void main(String[] args) {
		//FIND THE LENGTH OF A STRING
		String s= "Hi Welcome to Java Programming",t;
		System.out.println(s.length());
		
		//WANT TO CONVERT LOWERCASE(),UPPERCASE()
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//To remove unwanted spacing
		System.out.println(s.trim());
		// character
		System.out.println(s.charAt(5));
		// index
		System.out.println(s.indexOf("to"));
		//System.out.println(s.equalsTgnoreCase("to"));
		//SUBSTRING
		System.out.println(s.substring(5,9));
		//replace
		System.out.println(s.replace('t','x'));
		
		

	}

}
