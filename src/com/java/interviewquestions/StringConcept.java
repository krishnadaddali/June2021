package com.java.interviewquestions;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "Hello World";
		String s2 = "Hello World";
		
		String s3 = s1;
		
		String n1 = new String("Hello World");
		String n2 = new String("Hello World");
		
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		
		System.out.println(n1==s3);
		System.out.println(n2==s1);
		
		System.out.println("******************^^^^^^^^^^^^&&&&&&&&&&&&************");
		
		test(null);
		

	}
	
	public static void test(Object o){
		System.out.println("Object argument");
	}
	
	public static void test(String s){
		System.out.println("String argument");
	}

}
