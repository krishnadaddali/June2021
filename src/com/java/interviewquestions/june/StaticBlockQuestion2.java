package com.java.interviewquestions.june;

// Q2. How can we run a java program without making any object

public class StaticBlockQuestion2 {
	
	static{
		System.out.println(" static block ");
	}
	
	public static void test(){
		System.out.println(" Testing method ");
	}
	
	public static void cover(){
		System.out.println(" covering method ");
		test();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" main method ");
		test();
		StaticBlockQuestion2.test();
		cover();
		

	}

}
