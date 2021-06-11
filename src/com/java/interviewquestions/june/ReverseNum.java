package com.java.interviewquestions.june;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		revernum();
		
	}
	
	
	public static void revernum(){
		
		int num = 123456;		
		int rev = 0;
		
	 int x = 6%2;           // Remainder 	 
	 System.out.println(x);
		
		while(num !=0){                       // refer tutorial - https://www.javatpoint.com/how-to-reverse-a-number-in-java
			rev = rev * 10 + num % 10;   
			num = num/10;
		}
		System.out.println(rev);

	}
	
	}
