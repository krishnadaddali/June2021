package com.java.interviewquestions;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// findDuplicateCharsWithCount("10101 01 k ri s k t ");

		findDuplicateCharsWithCount("10101");

	}

	private static void findDuplicateCharsWithCount(String str) {

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			// Take one char at a time
			char c = str.charAt(i);
			// don't count the spaces
			if (c == ' ')
				continue;
			for (int j = i + 1; j < str.length(); j++) {
				if (c == str.charAt(j)) {
					count++;
					// remove the char so that it is not picked again
					// in another iteration
					str = str.substring(0, j) + str.substring(j + 1);
				}
			}
			if (count > 1) {
				System.out.println(c + " found " + count + " times");
			}
		}
	}

	public static void intgercount(String str, int val) {

		int count = 0;

		for (char ch : str.toCharArray()) {

			if (ch == val) {
				count++;
			}
		}

		System.out.println(val + " : " + count);

	}

	public static void PrintDuplicateCharacter(String str) {

		char[] ch = str.toCharArray();
		int i = 0, j = 0;
		for (i = 0; i < ch.length; i++) {
			int count = 0;
			for (j = i + 1; j < ch.length; j++) {// 4 6 , 8 , 10
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(str.charAt(i) + " Occured " + count + " time");
			}

		}

	}

}
