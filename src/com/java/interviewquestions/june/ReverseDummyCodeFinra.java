package com.java.interviewquestions.june;

import java.io.IOException;

public class ReverseDummyCodeFinra {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		palindromeString("mom madam asdfasdf aaaabbaaaa baba");
		palindromeString("m");
		palindromeString(null);
		palindromeString("1");
		palindromeString("");

	}

	public static String palindromeString(String str) {

		if (str == null) {
			System.out.println("null String");
			return str;
		}

		if (str.isEmpty()) {
			System.out.println("empty String");
			return str;
		}

		if (str.length() == 1) {
			System.out.println("single Char");
			return str;
		}

		char[] a = str.toCharArray();
		int low = Integer.MAX_VALUE;
		int upper = Integer.MIN_VALUE;
		for (int i = 0; i < str.length(); i++) {
			int start = i;
			int end = i;
			while (start >= 0 && end < str.length()) {
				if (a[start] == a[end]) {
					if (end - start > upper - low) {
						upper = end;
						low = start;
					}
					end++;
					start--;
				} else {
					break;
				}

			}

		}
		for (int i = 0; i < str.length(); i++) {
			int start = i;
			int end = i + 1;
			while (start >= 0 && end < str.length()) {
				if (a[start] == a[end]) {
					if (end - start > upper - low) {
						upper = end;
						low = start;
					}
					end++;
					start--;
				} else {
					break;
				}
			}

		}
		for (int i = low; i <= upper; i++) {
			System.out.print(a[i]);
		}
		return str;
	}

}