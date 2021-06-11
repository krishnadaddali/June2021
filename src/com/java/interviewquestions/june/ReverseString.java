package com.java.interviewquestions.june;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using for loop

		String s = "Krishna";

		String rev = "";

		int len = s.length();

		for (int i = 0; i < s.length(); i++){
			
			System.out.println(i + " Character is " + s.charAt(i));
		}
		System.out.println("The String length is : " + len);

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}

		System.out.println(rev);

		/*
		 * StringBuffer sb = new StringBuffer(s);
		 * 
		 * System.out.println(sb.reverse());
		 * 
		 * 
		 * String rev = "";
		 * 
		 * 
		 * int len = s.length();
		 * 
		 * for(int i = len-1; i>=0; i--){
		 * 
		 * rev = rev + s.charAt(i); }
		 */

	}

}
