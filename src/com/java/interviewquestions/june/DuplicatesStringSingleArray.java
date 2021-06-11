package com.java.interviewquestions.june;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesStringSingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Brute Force
		// 2. HashSet
		// 3. HashMap<K,V>
		// 4. Streams

		String infra[] = { "Amazon", "GCP", "Azure", "Ali Baba", "Sauce Labs", "Azure", "GCP" };

		System.out.println("************** Brute Force method ****************");

		for (int i = 0; i < infra.length; i++) {
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}

		System.out.println("************ HashSet Method ******************");

		Set<String> programinglangnames = new HashSet<String>();
		for (String s : infra) {
			if (programinglangnames.add(s) == false) {
				System.out.println(s);
			}
		}

		System.out.println(" ************** HasHMap Method ***************** ");

		Map<String, Integer> languagenames = new HashMap<String, Integer>();
		for (String langnamemap : infra) {
			Integer count = languagenames.get(langnamemap);
			if (count == null) {
				languagenames.put(langnamemap, 1);
			} else {
				languagenames.put(langnamemap, count + 1);
			}

		}

		// print all the duplicate elements

		Set<Entry<String, Integer>> entrySet = languagenames.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}

		}

	}
}
