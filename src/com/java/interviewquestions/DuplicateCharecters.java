package com.java.interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printDuplicateCharecters("A");
		printDuplicateCharecters("");
		printDuplicateCharecters(null);
		printDuplicateCharecters("ammma");
		printDuplicateCharecters("tesla");
		printDuplicateCharecters("Naveen");
		printDuplicateCharecters("1000");
		printDuplicateCharecters("007 james bond");
	}

	public static void printDuplicateCharecters(String str) {
		if (str == null) {
			System.out.println("null String");
			return;
		}
		if(str.isEmpty()){
			System.out.println("empty String");
			return;
		}
		if (str.length() == 1) {
			System.out.println("single Char String");
			return;
		}

		char words[] = str.toCharArray();
		Map<Character, Integer> charactermap = new HashMap<Character, Integer>();

		for (Character ch : words) {
			if (charactermap.containsKey(ch)) {
				charactermap.put(ch, charactermap.get(ch) + 1);

			} else {
				charactermap.put(ch, 1);
			}
		}

		// Print the Map

		Set<Map.Entry<Character, Integer>> entrySet = charactermap.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}

		}
	}

}
