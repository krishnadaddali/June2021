package com.java.interviewquestions.june;

public abstract class Bank { 
	
	int amnt = 100;
	final int rate = 10;
	static int loanrate = 5;
	
	// partial abstraction 
	// hiding the implementation logic 
	// Abs class can have abs method & Non abs methods
	// Cannot create the object of abstract class
	
	public abstract void loan(); // abstract method -- no body
	
	// Non-abstract methods
	public void credit(){
		System.out.println(" Bank credit ");
	}
	
	public void debit(){
		System.out.println(" Bank debit ");
	}
		
}
