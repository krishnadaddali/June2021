package com.java.interviewquestions;

public class CheckIsNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isNumeric(null));
		System.out.println(isNumeric(""));
		System.out.println(isNumeric(" "));
		System.out.println(isNumeric("1"));
		System.out.println(isNumeric("12"));
		System.out.println(isNumeric("testing"));
		System.out.println(isNumeric("testing123"));
		System.out.println(isNumeric("123t"));
		System.out.println(isNumeric("1.2"));
		System.out.println(isNumeric("-12"));
		System.out.println(isNumeric("0"));
		
		
		System.out.println(isNumeric("\0"));
		
		
	}

	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() == 0;

	}

	public static boolean isNumeric(CharSequence cs) {
		if (isEmpty(cs)) {
			return false;
		}
		int len = cs.length();
		for (int i = 0; i < len; i++) {
			if (!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}
		return false;

	}

}
