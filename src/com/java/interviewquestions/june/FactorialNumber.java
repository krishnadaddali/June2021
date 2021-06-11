package com.java.interviewquestions.june;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// fact of 3 = 3 * 2 * 1 = 6
		// fact of 4 = 4 * 3 * 2 * 1 = 24
		// fact of 5 = 5 * 4 * 3 * 2 * 1 = 120
		// fact of 0 = 1
		
		System.out.println(factorialNum(5));
		
		System.out.println(factorialNum(4));
		
		System.out.println(fact(4));
		System.out.println(fact(3));
		

	}

	// without recursive -- use for loop
	public static int factorialNum(int input){
		int fact = 1;
		for(int i=1; i<=input; i++){
			fact = fact * i;
			
		}return fact;
		
	}
	
	// Recursive function
	
	public static int fact(int input){
		if(input==0)
			return 1;
		else
			return (input * fact(input-1));
		
	}
}
