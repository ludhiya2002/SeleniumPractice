package d;

//import java.util.Scanner;

import pg1.sample1;

class demoA extends sample1{
	int m =25;
	demoA(){
		System.out.println("child constructor");
	}
	demoA(int m){
		super(m);
	}
	public void fun() {
		System.out.println("child class fun");
		super.fun();
		System.out.println(m);
		System.out.println(super.m);
	}
	public static void main(String[] args) {
		sample1 s = new sample1();
		s.fun();
		sample1.fun(10,0,"welcome");
		s.setPassword("xxx");
		System.out.println(s.getPassword());
		
		demoA d = new demoA(12);
		//d.m=5;
		d.fun();
		
	}
	
	

}
