package com.java.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class JavaJDk8toJDK15AllImportantFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(e -> e%2 == 0).forEach(e -> System.out.println(e));
		Stream.of("hello", "java")
			.map(e -> e + " world")	
				.forEach(System.out::println);
		
		//optional
		String s[] = new String[5];
		s[2] = "Krishna";
		Optional<String> isNull = Optional.ofNullable(s[2]);
		
		if(isNull.isPresent()){
			System.out.println( s[2]  + " " + s[2].length());
		}else
			System.out.println("Value is not availble ");
		
		isNull.ifPresent(e -> System.out.println(e.length()));
		
		Optional<String> nothing = Optional.empty();
		nothing.ifPresent(e -> System.out.println("Bye"));
		
		
		// Jshell: JDK 9
		
		// factory methods for immutable collections 
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
	//	List<String> lang = List.of("Program","C","C++","Java");
	
		// Due to stopped video because JDK is not up to date watching video until 18:03
		
		
		
		
		
	}
	 	
	 	
	 	

}
