package com.java.interviewquestions.june;

public class FinalizeConcept {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();
		

	}
	
	public static void finaize(){
		System.out.println(" finalize method ");
	}

}
