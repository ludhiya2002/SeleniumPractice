package Example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filehandlingexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> s = new ArrayList<>();
		s.add("Hello");
		s.add("Welcome");
		s.add("This is java File handling");

		//Create a new file
		File f = new File("Sample.txt");
		f.createNewFile();
		
		//to write something
		FileWriter fw = new FileWriter("Sample.txt");
		fw.write("Hello Welcome to Java");
		fw.append("\nThis is Java Fundamentals");
		fw.close();
		
		// to read a file
		File fr = new File("Sample.txt");
		Scanner sc = new Scanner(fr);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		
		//delete the file
		File fd = new File("Sample.nxt");
		if(fd.delete()) {
			System.out.println("File is deleted");
		}
	}
	}
		

	

