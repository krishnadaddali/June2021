package com.java.interviewquestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharCountTest {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		lettercount("java");
	//	lettercount("A");
		// lettercount("");
		// lettercount(null);
		// lettercount("ammma");
		// lettercount("tesla");
		// lettercount("Naveen");
		// lettercount("1000");
		// lettercount("007 james bond");

	}

	
	public static void lettercount(String input) {

		Map<Character, Integer> charcount = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {

			// read the char fron the String

			Character c = input.charAt(i);

			// check the character hashmap present

			Integer count = charcount.get(c);

			// check the character not present in hashmap

			if (count == null) {
				charcount.put(c, 1);
			} else {
				charcount.put(c,  count + 1);
			}
			for (Entry<Character, Integer> entry : charcount.entrySet()) {

				System.out.println(entry.getKey() + " ( " + entry.getValue() + " ) ");

			}
		}

	}
}
