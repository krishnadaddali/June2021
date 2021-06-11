package com.learning.basicjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Collections.synchronizedList
		List<String> nameslist = Collections.synchronizedList(new ArrayList<String>());

		nameslist.add("Java");
		nameslist.add("Python");
		nameslist.add("Ruby");
		nameslist.add("Selenium");
		nameslist.add("Spring");

		// add, remove - we don't need explict sycroniztion

		// to fetch/traverse the values from the list - we have to use from
		// explict sycroniztion

		synchronized (nameslist) {

			Iterator<String> lang = nameslist.iterator();

			while (lang.hasNext()) {
				System.out.println(lang.next());
			}
		}

		// 2. copyOnWriteArrayList -- its class - Thread-Safe

		CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<String>();

		emplist.add("Tom");
		emplist.add("Kim");
		emplist.add("Rim");
		emplist.add("Sim");

		// We don't need explict sychronization for any operation
		// add/remove/traverse
		
		System.out.println("*************************");

		Iterator<String> names = emplist.iterator();

		while (names.hasNext()) {
			System.out.println(names.next());
		}
		
		List<String> list = new ArrayList<String>();
		
		System.out.println("*************************");
		
		System.out.println((list.size()));
		

	}

}
