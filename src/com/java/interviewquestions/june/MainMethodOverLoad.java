package com.java.interviewquestions.june;

public class MainMethodOverLoad {
	
	// JVM is watching

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" main method-1 ");
		
		main("Testing");
		 main(5);
		 main(5,5);
		 

	}
	
	public static void main(String args) {
		// TODO Auto-generated method stub
		
		System.out.println(" main method-2 ");

	}
	public static void main(int a) {
		// TODO Auto-generated method stub
		
		System.out.println(" main method-3 ");

	}
	public static void main(int a, int b) {
		// TODO Auto-generated method stub
		
		System.out.println(" main method-2 ");

	}

}
