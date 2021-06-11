package com.corejava.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CharacterCountTeraData { // Q: How to find the maximum occurring
										// character in a given String?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// duplicatecharount("mom madam asdfasd aaaabbaaaa baba");

		// findcommonchar("mom madam asdfasd aaaabbaaaa baba");

		// findcommonchar("java ");

		// findcommonchar("A");
		// findcommonchar("");
		// findcommonchar(null);
		// findcommonchar("ammma");
		// findcommonchar("tesla");

		// findcommonchar("1000");
		findcommonchar("007 james bond");

		System.out.println("***************************");

		findcommoncharacter("amma");

	}

	public static void findcommonchar(String str) {

		if (str == null) {
			System.out.println("null String");
			return;
		}
		if (str.isEmpty()) {
			System.out.println("empty String");
			return;
		}
		if (str.length() == 1) {
			System.out.println("single Char String");
			return;
		}

		char words[] = str.toCharArray();

		System.out.println(words);
		Map<Character, Integer> charactermap = new LinkedHashMap<Character, Integer>();

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

	// *******************************************************

	public static void findcommoncharacter(String str) {

		if (str == null) {
			System.out.println("null String");
			return;
		}
		if (str.isEmpty()) {
			System.out.println("empty String");
			return;
		}
		if (str.length() == 1) {
			System.out.println("single Char String");
			return;
		}

		Map<Character, Integer> charactermap = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			// read character
			Character c = str.charAt(i);

			// check character is present in hashmap
			Integer charcount = charactermap.get(c);

			// character is not present in hashmap
			if (charcount == null)
				charactermap.put(c, 1);
			else
				charactermap.put(c, charcount + 1);

		}

		// Print the Map

		Set<Map.Entry<Character, Integer>> entrySet = charactermap.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}

		}

		// either two ways you can print value

		for (Map.Entry<Character, Integer> entry : charactermap.entrySet()) {

			if (entry.getKey() == ' ')
				System.out.println(entry.getKey() + " (empty charcter) : " + entry.getValue());
			else
				System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
