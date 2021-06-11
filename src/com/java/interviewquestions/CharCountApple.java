package com.java.interviewquestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CharCountApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numcount("0101010101");
		numbercount("0101010101");
	//	numberscount("0101010101");
	}

	public static void numcount(String input) {

		char[] charcount = input.toCharArray();

		int zerocounter = 0;
		int onecounter = 0;

		for (Character c : charcount) {

			if (c == '0') {
				zerocounter++;
			} else if (c == '1') {
				onecounter++;
			}

		}
		System.out.println(" No of zero's :  " + zerocounter);
		System.out.println(" No of zero's :  " + onecounter);

	}

	public static void numbercount(String input) {

		List<Character> charlist = new ArrayList<Character>();
		int zerocounter = 0;
		int onecounter = 0;
		for (int i = 0; i < input.length(); i++) {
			charlist.add(input.charAt(i));
		}
		Iterator itr = charlist.iterator();
		while (itr.hasNext()) {
			Character c = (Character) itr.next();
			if (c == '0') {
				zerocounter++;
			} else {
				onecounter++;
			}

		}
		System.out.println(" No of zero's :  " + zerocounter);
		System.out.println(" No of zero's :  " + onecounter);

	}

}
