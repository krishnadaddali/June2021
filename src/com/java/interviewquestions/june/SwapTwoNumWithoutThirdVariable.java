package com.java.interviewquestions.june;

public class SwapTwoNumWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 5;
		int y = 10;
		
		// Test cases 1. Using third var t
		
		/*int t;
		t = x;
		x = y;
		y = t;*/
		
		System.out.println(y);
		
		// Test cases 2. with out Using third var t: Using + operator
		
		x = x + y;
		y = x - y;
		x = x -y;
		
		System.out.println(x);
		
		
		// Test Case 3: with out Using third var t: Using * operator
		
		x = x * y; // 50
		y = x / y; // 5
		x = x / y; // 10
		
		System.out.println("***********" + x);
		
		// TC 4: Using XOR
		
		x = x ^ y; // 15 - 1111
		y = x ^ y; // 10 - 1010
		x = x ^ y; // 5  - 0101
		
		System.out.println(x);
		System.out.println(y);
		

	}

}
