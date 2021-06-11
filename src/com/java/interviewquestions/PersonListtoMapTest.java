package com.java.interviewquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learning.moment.pojo.Person;

public class PersonListtoMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person krishna = new Person(101, "Krisha", "TX");
		Person chani = new Person(111, "Chani", "CA");
		Person boni = new Person(121, "Boni", "FL");
		Person gopi = new Person(91, "Gopi", "NC");
		Person suss = new Person(101, "Suss", "ML");

		// Add to array

		List<Person> personlist = new ArrayList<Person>();

		personlist.add(suss);
		personlist.add(gopi);
		personlist.add(boni);
		personlist.add(chani);
		personlist.add(krishna);

		System.out.println("Print the person names: " + personlist);

		// By using for each loop to print person names

		for (Person person : personlist) {
			System.out.println(person);
		}

		System.out.println("*******************");

		Map<Integer, String> personsmap = new HashMap<Integer, String>();

		// put every value list to Map
		for (Person person : personlist) {
			personsmap.put(person.getId(), person.getName());
			System.out.println(person);
		}

		// Streams
		System.out.println(" *********** Strems ***********");
		 Map<Integer, String>
         map = personlist.stream()
                   .collect(
                       Collectors
                           .toMap(
                               Person::getId,
                               Person::getName,
                               (id, name)
                                   -> id + ", " + name,
                               HashMap::new));
		 
		// print map
	        map.forEach(
	            (id, name) -> System.out.println(id + "=" + name));

	}

}
