package arrays;

import java.util.Arrays;

public class basic {

	public static void main(String[] args) {
		// DECLARING AN ARRAY
		//int a[] = {2,3,5,7};
		//int x[] = new int[5];
		//String s[] = {"xyz","abc","ccc"};
		//System.out.println(a[3]);
		//System.out.println(s[1]);
		
		// modify
		//System.out.println(s[2]="aaa");
		
		// length
		//System.out.println(s.length);
		
		// sort an array;
		//Arrays.sort(a);
		//System.out.println(a[0]);
		
		// CREATE MULTI DIMENSIONAL ARRAY
		//int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(a[1][2]);
		//String s ="This is a string";
		//String t[] = {"This","is","java"};
		//String j = String.join(s, t);
		//String.join(".", t);
		//Arrays.toString(t);
		//System.out.println(j);
		
		// CONVERT STRING INTO ARRAY
		//String s = "This is String";
		//String t[] = s.split(" ");
		//System.out.println(t[2]);
		
		// Greatest number in array
		int a[] = {10,30,40,50};
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
		
		

	}

}
