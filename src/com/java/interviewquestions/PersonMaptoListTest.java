package com.java.interviewquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonMaptoListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Krishna");
		map.put(5, "Sussma");
		map.put(2, "Venky");
		map.put(4, "Surya");
		map.put(9, "Vikram");
		map.put(3, "Ranjit");
			
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		 List<Integer> keyList = new ArrayList(map.keySet());
	        List<String> valueList = new ArrayList(map.values());
	        
	        
	        System.out.println(keyList);
	        System.out.println(valueList); 

	}

}
