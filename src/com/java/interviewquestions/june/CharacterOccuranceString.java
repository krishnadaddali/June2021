package com.java.interviewquestions.june;

// count occurrences of character in String

public class CharacterOccuranceString {

	public static void main(String args[]) {

		charcount();
		getCharOcuurance("String", 'g');
		getCharCount("String", 'i');

	}

	// o -2, i - 1
	// CharArray -- for loops
	// str.len -- charAt(i)
	// Apache Common StringUtils : Java doesn't support, need to add 3rd party
	// Streams

	public static void charcount() {

		String s = " i love coding and testing ";

		int count = 0;
		for (char ch : s.toCharArray()) {

			if (ch == 'o') {
				count++;
			}

		}
		System.out.println(" charcount : " + count);

	}

	public static void getCharOcuurance(String s, char val) {
		int count = 0;
		for (char ch : s.toCharArray()) {
			if (ch == val) {
				count++;
			}
			
		}System.out.println(" getCharOcuurance : " + val + ":" + count);

	}
	
	public static void getCharCount(String s, char val) {
		int count = 0;
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == val) {
				count++;
			}
		}
		System.out.println("getCharCount - " + val + ":" + count);
	}
	
	public static void stream(String str, String val){
		
		String s = " i love coding and testing ";
		
	//	long count = s.chars().mapToObj(e -> String.valueOf((char)e)
		
		
	}
	

}
