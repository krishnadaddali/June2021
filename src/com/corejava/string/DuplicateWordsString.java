package com.corejava.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		duplicateChars();
		duplicateWordsString("This is a sentence", "is");

	}

	/* String  */
	public static void duplicateWordsString(String str1, String str2) {

		String commonChars = "";

		// creating a string of all common chars
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {

					commonChars += str1.charAt(i);
				}
			}
		}

		// replace common chars in str and str2 with a blank
		for (int i = 0; i < commonChars.length(); i++) {
			String charToRemove = commonChars.charAt(i) + "";// change char to
																// string
			str1 = str1.replace(charToRemove, "");
			str2 = str2.replace(charToRemove, "");

		}

		String s3 = str1 + str2;

		System.out.println("the string after removing common character  and concatenation is " + s3);

	}

	/* Remove the duplicate characters given string */

	public static void duplicateChars() {

		String s = "aabbccdefatafaz";

		char[] chars = s.toCharArray();

		Set<Character> charset = new LinkedHashSet<>();
		for (char c : chars) {
			charset.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charset) {
			sb.append(character);
		}

		System.out.println(sb.toString());
	}

	public String removeDuplicates(String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (!result.contains(String.valueOf(input.charAt(i)))) {
				result += String.valueOf(input.charAt(i));
			}
		}
		return result;
	}

}
