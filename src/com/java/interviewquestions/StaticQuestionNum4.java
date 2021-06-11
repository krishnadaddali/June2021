package com.java.interviewquestions;

public class StaticQuestionNum4 {
	
	int age;
	
	String name;
	
	static double  j = 20;
	
	
	private StaticQuestionNum4(){         // Q4
		
		age = 30;
	}
	
 static {
		
		StaticQuestionNum4 e1 = new StaticQuestionNum4();
		
		e1.name = "Krishna";
		
		j =20;
	}
	
	public static int createObj(){
		
		StaticQuestionNum4 obj1 = new StaticQuestionNum4();
		obj1.age =40;
		return obj1.age;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticQuestionNum4 obj = new StaticQuestionNum4();
		
		System.out.println(obj.age);
		
		System.out.println(obj.name + " " + j);

	}

}
