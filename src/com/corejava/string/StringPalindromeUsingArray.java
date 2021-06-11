package com.corejava.string;

import java.util.Arrays;
import java.util.List;

public class StringPalindromeUsingArray {

	public static void main(String[] args) {

		List<String> vect = Arrays.asList("geekf", "geeks", "or", "keeg", "abc", "bc");
		
		System.out.println(checkPalindromePair(vect));

		/*if (checkPalindromePair(vect) == true)
			System.out.println("Yes");
		else
			System.out.println("No");*/
	}

	

	public static boolean isPalindrome(String str) {

		int len = str.length();

		// compare each character from starting with its corresponding character
		// from last
		for (int i = 0; i < len / 2; i++)
			if (str.charAt(i) != str.charAt(len - i - 1))
				return false;

		return true;
	}

	public static boolean checkPalindromePair(List<String> vect) {
		// Consider each pair one by one
		for (int i = 0; i < vect.size() - 1; i++) {
			for (int j = i + 1; j < vect.size(); j++) {
				String check_str = "";

				// concatenate both strings
				check_str = check_str + vect.get(i) + vect.get(j);

				// check if the concatenated string is
				// palindrome
				if (isPalindrome(check_str))
					return true;

				check_str = vect.get(j) + vect.get(i);

				// check if the concatenated string is
				// palindrome
				if (isPalindrome(check_str))
					return true;
			}
		}
		return false;
	}

}
