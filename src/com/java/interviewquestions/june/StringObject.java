package com.java.interviewquestions.june;

public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q: Howmany objects will be created? :: 3 
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = s1;
		
		String n1 = new String("Hello World");
		String n2 = new String("Hello World");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);

		System.out.println(n1 == n2);
		System.out.println(s1==s2);
		
		
		System.out.println("**********************************");
		
		// Q2: Howmany objects will be created? :: 1 
		

		String s5 = "Hello World";
		
		System.out.println("**********************************");
		
		// Q2: Howmany objects will be created? :: 2
		
		String s6 = new String("Hello World"); 
		
		// 1 is String pool 
		// 2nd is Heap area
		// Both are in Heap
		
		
		
		
	}

	
	
	
}
