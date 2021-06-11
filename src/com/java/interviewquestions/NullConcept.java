package com.java.interviewquestions;

public class NullConcept {
	
	static Object obj;
	static String str;
	static NullConcept nc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. case sensitive
		// Object obj = null
		
		//2 default ref vl will be null
		System.out.println(obj);
		System.out.println(str);
		System.out.println(nc);
		
		// 3. 
		
	//	Integer i = null;
	//	int j = i;
		
		// 4 instanceof
		
		Integer x = null;
		Integer y = 10;
		
		System.out.println(y instanceof Integer);
		System.out.println(x instanceof Integer);
		
		// 4 static vs non-static 
		
		NullConcept obj = null;
		obj.sum();
		obj.send();
		
		// 5 == and !=
		
		System.out.println(null == null);
		System.out.println(null != null);
		
		// 6
		
		String str = null;
		Integer b = null;
		Double d = null;
		
		String s1 = (String)null;
		System.out.println(s1 + 123);
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		
		Integer i2 = (Integer)null;
		Double d2 = (Double)null;
		
		
	}
	
	
	
	public static void sum(){
		System.out.println( " sum ");
	}
	
	public static void send(){
		System.out.println( " send ");
	}
}
