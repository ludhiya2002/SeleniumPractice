package Practice;

import java.util.HashSet;

public class Uniquecharacters {
	public static void main(String[] args) {
		
		String input = "abhadks";
		boolean isUnique = hasAllUniqueCharacters(input);
		
		if(isUnique) {
			System.out.println("The string has all unique characters.");
		}
		else {
			System.err.println("The string has duplicate characters.");
		}
	}
	public static boolean hasAllUniqueCharacters(String str) {
		HashSet<Character> charSet = new HashSet<>();
		
		for(int i=0;i<str.length();i++){
			char currentChar = str.charAt(i);
			
			if(charSet.contains(currentChar)) {
				return false;
			}
			charSet.add(currentChar);
		}
		return true;
		
	}

	
}
