package com.java.interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDuplecateWord("Hey java is java best lang is Java");
		
		findDuplecateWord("100 200 200 300 500 200 100 100");
		
		findDuplecateWord(" 12 1 2 2 2 2 4 5 6 6 8 ");
		
		
		

	}
	public static void findDuplecateWord(String input){
		
		//split
		String[] words = input.split(" ");
		
		//Create a hash map
		Map<String, Integer> wordcount = new HashMap<String, Integer>();
		
		// To check each word in given array 
		for(String word: words){
			
			//if word is present
			if(wordcount.containsKey(word)){
				wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
			}else{
				wordcount.put(word, 1);
			}	
		}
		
		//extracting all the keys of map - wordcount
		Set<String> wordsInString = wordcount.keySet();
		
		// loop through all the words in wordcount
		for(String word: wordsInString){
			if(wordcount.get(word)>1){
				System.out.println( word + " : " + wordcount.get(word) );
			}
		}
	}

}
