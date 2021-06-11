package com.java.interviewquestions.june;

public class DividedByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// what will be the o/p when you divide a number by zero?
	// Number = Integer, Double, Float
		
		System.out.println(9.0/0);
		System.out.println(19.12f/0);
		System.out.println(10/0.0);
		System.out.println(19.99999d/0);
		//System.out.println(0/0);
		System.out.println(0.0/0);
		System.out.println(12.13/0);
		
		System.out.println("*******************");
		
		//System.out.println(2/0);
		
			System.out.println(2.0/0);
			System.out.println(0.0/0);
			System.out.println(Math.sqrt(-1));
			
			System.out.println(Float.NaN == Float.NaN);
			System.out.println(Float.NaN != Float.NaN);
			
			double nan = 2.1 % 0; //Nan - Not a number
			System.out.println((2.1 % 0) == nan);
			System.out.println(nan == nan );
		

	}

}
