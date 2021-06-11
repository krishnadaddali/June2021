package com.learning.basicjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map1 = new HashMap<Integer, String>();

		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		Map<Integer, String> map2 = new HashMap<Integer, String>();

		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");

		Map<Integer, String> map3 = new HashMap<Integer, String>();

		map2.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");

		// 1. On the basis of key-value: use equals method

		System.out.println(map1.equals(map2)); // true
		System.out.println(map1.equals(map3)); // false

		// 2 compare hashmap for the same keys: keySet

		System.out.println(map1.keySet().equals(map2.keySet())); // true
		System.out.println(map1.keySet().equals(map3.keySet())); // true/false

		// 3. find out the extra keys

		Map<Integer, String> map4 = new HashMap<Integer, String>();

		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");

		// combine the keys from both maps: Using HashSet
		Set<Integer> combinekeys = new HashSet<>(map1.keySet());

		// add the keySet from map4
		combinekeys.addAll(map4.keySet());
		combinekeys.removeAll(map1.keySet());

		System.out.println(combinekeys);

		// comapre maps by value
		Map<Integer, String> map5 = new HashMap<Integer, String>();

		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");

		Map<Integer, String> map6 = new HashMap<Integer, String>();

		map6.put(4, "A");
		map6.put(5, "B");
		map6.put(6, "C");

		Map<Integer, String> map7 = new HashMap<Integer, String>();

		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");

		// duplicates are not allowed: using arraylist
		System.out.println(new ArrayList<>(map5.values()).equals((new ArrayList<>(map6.values())))); // true
		System.out.println(new ArrayList<>(map5.values()).equals((new ArrayList<>(map7.values())))); // false

		// duplicates are not allowed: using hashSet

		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); // true
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values()))); // true

	}

}
