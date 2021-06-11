package com.learning.basicjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. sort and then equals 
		
		List<String> list = new ArrayList<String>(Arrays.asList("A","B","C","D"));
		
		List<String> bag = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		List<String> cover = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		Collections.sort(list);
		Collections.sort(bag);
		
		System.out.println(list );
		
		System.out.println(bag );
		
		System.out.println(list.equals(bag));
		
		System.out.println(bag.equals(cover));
		
//		System.out.println("****" + list.retainAll(bag));
		
		System.out.println(list );
		
		System.out.println(bag );
		
		List<String> listnames = new ArrayList<String>(Arrays.asList("Telugu","English","Sceince","Social"));
		
		
		List<String> bagnames = new ArrayList<String>(Arrays.asList("Telugu","English","Sceince","Social","Tamil", "Yang"));
		
		listnames.retainAll(bagnames);
		
		System.out.println(listnames);

	}

}
