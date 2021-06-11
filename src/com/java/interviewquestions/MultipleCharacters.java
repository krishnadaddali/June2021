// API Testing interview questions https://www.youtube.com/watch?v=BkPzzbc3MIA

package com.java.interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MultipleCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// duplicateLetterCount("krishna 0001");
		charCount("j");
		charCount("");
		charCount(null);
		// charCount("ammma");
		// charCount("tesla");
		// charCount("Naveen");
		// charCount("1000");
		charCount("007 james bond");

	}

	public static void charCount(String input) {

		if (input == null) {
			System.out.println("null String");
			return;
		}
		if (input.isEmpty()) {
			System.out.println("empty String");
			return;
		}
		if (input.length() == 1) {
			System.out.println("single Char String");
			return;
		}

		Map<Character, Integer> charcountmap = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {

			Character c = input.charAt(i);

			Integer count = charcountmap.get(c);

			if (count == null) {
				charcountmap.put(c, 1);
			} else {
				charcountmap.put(c, count + 1);
			}
		}

		for (Entry<Character, Integer> entry : charcountmap.entrySet()) {

			System.out.println(entry.getKey() + " ( " + entry.getValue() + ")");
		}

	}

	public static void duplicateLetterCount(String input) {

		char[] words = input.toCharArray();

		Map<Character, Integer> lettermap = new HashMap<Character, Integer>();

		for (Character ch : words) {
			if (lettermap.containsKey(ch)) {

				lettermap.put(ch, lettermap.get(ch) + 1);
			} else {
				lettermap.put(ch, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entryset = lettermap.entrySet();

		for (Map.Entry<Character, Integer> entry : entryset) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
