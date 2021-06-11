package com.java.interviewquestions.june;

import java.net.URL;

public class TestNum {

	// Compare two int numbers(Integer Caching)

	// What will be the o/p // (byte) + (char) - (int) + long -1?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testcode();
		specialChar();
		withoutDoubleQuotes();

		// -128 to 127

		Integer num1 = 100;
		Integer num2 = 100;

		if (num1 == num2)
			System.out.println(" Both are equal ");
		else
			System.out.println(" Both are not equal ");
	}

	public static void testcode() {

		int i = (byte) +(char) -(int) +(long) -1;

		System.out.println(i);

		int j = (byte) 1;
		System.out.println(j);

	}

	public static void specialChar() {

		System.out.println("/\"Hello\"/");
		System.out.println("\"Hello\"");

		System.out.println("I love \"java\" and \"programing\" and \"movies\"");
		System.out.println("'I love \"java\" and \"programing\" and \"movies\"'");

	}

	public static void withoutDoubleQuotes() {

		System.out.println("***************************");

		System.out.println(" Java ");

		int i = 20;

		// \u000d

		System.out.println(i);
		System.out.println();
		System.out.println(" Good Morning ");
	}

	public static void UrlCompare() {

		System.out.println("***************************");

		// System.out.println(new URL("https://app.hubspot.com/").equals());

	}

}
