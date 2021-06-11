package com.learning.basicjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithDiffLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> studentlist = new ArrayList<Object>();

		studentlist.add("Krishna");
		studentlist.add("Rama");
		studentlist.add("Brama");
		studentlist.add("Raghu");

		studentlist.add(100);
		studentlist.add(10.35);
		
		System.out.println("ArrayList size : " + studentlist.size());

		// for each loop
		for (Object student : studentlist) {
			System.out.println(student);
		}

		System.out.println("**************");

		// JDK - 8 Streams with Lamda

		studentlist.stream().forEach(e -> System.out.println(e));

		// Iterator

		System.out.println("**************");

		// While loop to print the objects

		Iterator<Object> student = studentlist.iterator();

		while (student.hasNext()) {

			System.out.println(student.next());
		}
		
		//List with other collection
		
		List<Integer> numberlist = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		System.out.println(numberlist);
		
		
		List<String> programingnamelist = new ArrayList<String>(Arrays.asList("Java","Spring","Angular","Python"));
		
		System.out.println(programingnamelist);

	}

}
