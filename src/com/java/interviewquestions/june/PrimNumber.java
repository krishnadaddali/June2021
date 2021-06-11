package com.java.interviewquestions.june;

public class PrimNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(primNum(2));
		System.out.println(primNum(0));
		System.out.println(primNum(-2));
		System.out.println(primNum(10));
		System.out.println(primNum(9));
		
		System.out.println("**************");
		
		getPrimNum(20);
		

	}

	public static boolean primNum(int input) {
		// Edge cases - corner cases

		if (input <= 1)
			return false;

		else
			for (int i = 2; i < input; i++) {
				if (input % i == 0)
					return false;
			}

		return true;
		

	}
	
	
	public static void getPrimNum(int input){
		for(int i =2; i<input; i++){
			if(primNum(i))
				System.out.println( i + " ");
		}
	}

}
