package com.java.interviewquestions.june;

public class SwapStringWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello";
		String b = "World";
		
		System.out.println(" Before Swapping : ");
		System.out.println(" The value of a is  : " + a);
		System.out.println(" The value of b is  : " + b);
		
		// 1. append a and b
		
		a = a + b; // HelloWorld
		
		// 2. Store intial string a in String b
		
		b = a.substring(0, a.length() - b.length());
		
		// 3. Stroe intial string b in String a
		
		a = a.substring(b.length());
		
		System.out.println(" The value of a and b swapping : ");
		System.out.println(" The value of a is  : " + a);
		System.out.println(" The value of b is  : " + b);

	}

}
