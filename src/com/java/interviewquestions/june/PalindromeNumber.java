package com.java.interviewquestions.june;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 151, 454, 34543, 161, 78987
		
		palindromeNum(151);
		palindromeNum(10);

	}
	
	public static void palindromeNum(int input){
		
		int r =0;
		int sum=0;
		int t;
		
		t = input;
		
		while(input>0){
			r = input%10; // get the Remainder
			sum = (sum*10)+r;
			input = input/10;
		}
		
		if(t==sum){
			System.out.println("palindrom Num");
		}else{
			System.out.println("its not a palindrom Num");
		}
		
		
		
	}

}
