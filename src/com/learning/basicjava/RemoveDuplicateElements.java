package com.learning.basicjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new	ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 6));

		// LinkedHashSet

		Set<Integer> numberslist = new LinkedHashSet<Integer>(numbers);

		List<Integer> numberslistwithoutduplicates = new	ArrayList<Integer>(numberslist);
		
		System.out.println(numberslistwithoutduplicates);
		
		// Java - 8 Streams Concept
		
		List<Integer> marks = new	ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 6));
		
		List<Integer> markslist = marks.stream().distinct().collect(Collectors.toList());
		
		System.out.println(markslist);

	}

}
