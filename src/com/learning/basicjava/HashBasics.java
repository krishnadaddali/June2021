package com.learning.basicjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> contrymap = new HashMap<String, String>();
		
		contrymap.put("Texas", "USA");		
		contrymap.put("Sydny", "Australia");
		contrymap.put("Ontario", "Canada");
		contrymap.put("HongKong", "China");
		contrymap.put("Hyd", "India");
		contrymap.put("Hyd", "Barath");
		contrymap.put("Hyd", "Hindusthan");
		contrymap.put(null, "India");
		contrymap.put(null, "Barath");
		contrymap.put(null, "Hindusthan");
		
		System.out.println(contrymap.get("Hyd"));
		System.out.println(contrymap.get(null));
		
		// iterator over the keys: by using keySet()
		
		Iterator<String> loop = contrymap.keySet().iterator();
		
		while(loop.hasNext()){
			String key = loop.next();
			String value = contrymap.get(key);
			System.out.println(" Key = " + key + ", Value = " + value );
			
		}
		
		// iterator: over set (pair ): by using entrySet
		System.out.println("***************");
		Iterator<Entry<String, String>> loop1 = contrymap.entrySet().iterator();
		
		while(loop1.hasNext()){
			Entry<String, String> enrty = loop1.next();
			System.out.println("Key =" + enrty.getKey() + ", Value = " + enrty.getValue());
		}
		
		// iterate hashmap using java-8 for each and lamda
		System.out.println("***************");
		contrymap.forEach((k,v) -> System.out.println(" key = " + k + ", value = " + v));
		
		

	}

}
