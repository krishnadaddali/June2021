package com.java.interviewquestions.june;

public class StaticBlockQuestionNo9 {
	
	

	static{
		System.out.println(" Static block ");
	}
	{
		System.out.println(" Instance intialization block "); // Instance block
	}
	
	StaticBlockQuestionNo9(){
		System.out.println(" Constructor ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method");
		
		new StaticBlockQuestionNo9();

	}

}



