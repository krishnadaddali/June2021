package com.java.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 2, 3, 4, 5, 5, 5, 6, 3, 6, 6, 6, 6 };
		int[] numberslist = { 1, 2, 3, 4, 5, 5, 5, 6, 3, 6, 6, 6, 6 };

		commomString();
		programingList();

		commonNum(numbers, numberslist);
		findCommonElement(numbers, numberslist);
		singleArrayDuplicateElemetns();

		// commomString(names, nameslist);

	}

	public static void programingList() {

		Set<String> names = new HashSet<String>(
				Arrays.asList("Java", "Scala", "Python", "Java", "Singleton", "Selenium", "Java"));

		System.out.println("To avoid the duplicate names : " + names);
	}

	public static void commomString() {

		String[] names = { "Java", "Scala", "Python" };
		String[] nameslist = { "Java", "Scala", "Python", "Java", "Singleton", "Selenium", "Java" };

		// Outer loop
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < nameslist.length; j++) {// inner loop
				if (names[i].equals(nameslist[j])) {
					System.out.println(names[i]);
					break;
				}
			}
		}
	}

	public static void commonNum(int[] numbers, int[] numberslist) {

		System.out.println("********** Using for loop *********");

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numberslist.length; j++) {
				if (numbers[i] == numberslist[j]) {
					System.out.println(numbers[i] + "");
					break;
				}
			}
		}
	}

	public static void findCommonElement(int[] numbers, int[] numberslist) {

		System.out.println("********** Using HashSet *********");

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		// adding elements from array1
		for (int i : numbers) {
			set1.add(i);
		}
		// adding elements from array2
		for (int i : numberslist) {
			set2.add(i);
		}
		set1.retainAll(set2);
		System.out.println("Common elements- " + set1);
	}

	public static void singleArrayDuplicateElemetns() {

		System.out.println("********** Using single array to find the common elements *********");

		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 6));

		// LinkedHashSet

		Set<Integer> numberslist = new LinkedHashSet<Integer>(numbers);

		System.out.println("************ : " + numberslist);

		List<Integer> numberslistwithoutduplicates = new ArrayList<Integer>(numberslist);

		System.out.println(numberslistwithoutduplicates);

		// Java - 8 Streams Concept

		System.out.println("********** Using single array to find the common elements with Streams *********");

		List<Integer> marks = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 6));

		List<Integer> markslist = marks.stream().distinct().collect(Collectors.toList());

		System.out.println(markslist);
	}

}
