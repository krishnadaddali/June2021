package com.java.interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class UtilService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map mymap = new HashMap();
		mymap.put("1","one");
		mymap.put("1","not one");
		mymap.put("1","not one");
		mymap.put(null,"surely not one");
		System.out.println(mymap.get("1"));
		
		System.out.println("****************");
		
		
		int a = 10;

        int b = a;

        a = 14;

        System.out.println(b);
        
        System.out.println(a);


	}

}
