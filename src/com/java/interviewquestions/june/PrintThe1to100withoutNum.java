package com.java.interviewquestions.june;

public class PrintThe1to100withoutNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// o/p no from 1.....100 without using any numbers in your code
		
		
		printNum();

	
	}
	
	public static void printNum(){
		
		int one = 'A'/'A'; //1
		String s1 = "..........";
		
		for(int i=one; i<=(s1.length() * s1.length()); i++){
			System.out.println(i);
		}
	
		System.out.println("************");
		
		// a-97 b-98 c-99 d-100
		for(int i=one; i<='d'; i+=one){
			System.out.println(i);
		}
		
		
	}
	
	

}
