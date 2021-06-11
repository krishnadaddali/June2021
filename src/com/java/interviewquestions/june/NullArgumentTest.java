package com.java.interviewquestions.june;

public class NullArgumentTest {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		
	test(null);
		
		// Pass null argument with method overloading with string and object types
	}	
		public static void test(Object o){
			System.out.println("Objetc argument");
		}
		
		public static void test(String s){
			System.out.println("String argument");
		}

	}


