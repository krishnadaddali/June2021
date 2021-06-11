package com.java.interviewquestions.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesNumberSingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		duplicateNum();
		singleArrayDuplicateElemetns();

	}

	public static void duplicateNum() {

		int[] a = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		
		System.out.println("Duplicate elements in given array using for loop: ");
		
		// Searches for duplicate element
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					System.out.println(a[j] + "   ");
			}
		}
	}

	// Figure out the below solutions not clearly
	
	public static void singleArrayDuplicateElemetns() {

		System.out.println("********** Using single array to find the common numbers using List Java 8 *********");

		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 6));

		// LinkedHashSet

		Set<Integer> numberslist = new LinkedHashSet<Integer>(numbers);

		System.out.println("************ : " + numberslist);

		List<Integer> numberslistwithoutduplicates = new ArrayList<Integer>(numberslist);

		System.out.println(numberslistwithoutduplicates);

		// Java - 8 Streams Concept

		System.out.println("********** Using single array to find the common elements with Streams *********");

		List<Integer> marks = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 4, 3, 3, 5, 7, 6));

		List<Integer> markslist = marks.stream().distinct().collect(Collectors.toList());

		System.out.println(markslist);
	}
}
