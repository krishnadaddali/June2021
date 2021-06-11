//find longest panlindrome in a given string., For eg., if the given string is "mom madam asdfasdf aaaabbaaaa baba", 
//the output should return aaaabbaaaa

package com.java.interviewquestions.june;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReversePlaindromGivenStringFinra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(plaindromReverse("mom madam asdfasdf aaaabbaaaa baba"));

		// System.err.println("****************");

	//	longword(" 101, 1101 , 22222");
	//	longword(" -101, -1101 , -22222, -7777777, 0 , 55555");

		longword("mom madam asdfasdf aaaabbaaaa baba");
	//	longword("m");
	//	longword(null);
	//	longword("1");

		findMaxLengthWord("Today is the happiest day of my life");

	}

	// Using Streams

	public static void findMaxLengthWord(String s) {

		List<String> strings = Arrays.asList(s.split(" "));
		String biggestWord = Collections.max(strings, Comparator.comparing(String::length));
		System.out.println(biggestWord);

	}

	// using for loop

	public static String longword(String s) {

		if (s == null) {
			System.out.println("null String");
			return s;
		}
		if (s.isEmpty()) {
			System.out.println("empty String");
			return s;
		}
		if (s.length() == 1) {
			System.out.println("single Char String");
			return s;
		}

		String[] word = s.split(" ");
	
		
		String maxlethWord = "";

		for (int i = 0; i < word.length; i++) {
			
			System.out.println(word[i]);
			
			if (word[i].length() >= maxlethWord.length()) {
				maxlethWord = word[i];
			}
		}
		System.out.println(maxlethWord);
		return maxlethWord;
	}

}