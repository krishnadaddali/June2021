package com.java.interviewquestions.june;

public class DoubleMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// What is the value of double MIN_VALUE
		// Which one is bigger -> Double MIN_VALUE or 0.0d ?
		// Which one is bigger -> Double Min_VALUE or NEGATIVE_INFINITY ?
		
		System.out.println(Double.MIN_VALUE); // is a +ve num
		
		System.out.println(Long.MIN_VALUE); // is a -ve num
		System.out.println(Integer.MIN_VALUE); // is a -ve num
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); // is a +ve num
		
		System.out.println(Math.min(Integer.MIN_VALUE, 0.0d)); 
		
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f)); 
		
		System.out.println(Float.MIN_VALUE);  // is +ve num
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY)); 
		
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f)); 
	}

}
