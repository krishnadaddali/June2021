package com.java.interviewquestions.june;


// Q1. Explain static block in Java

// Q2. How can we run a java program without making any object

// Q3. Diff b/w static block and static method

// Q4. how can we create objects if we make the constructor private

// Q5. Is it possible to compile and run the java program without writing main() method?

// Q6 Can we intialize member variables within static block 

//--------------------------------------

// Q1. Explain static block in Java below answer

public class StaticBlockQuestions {
	
	static{
		System.out.println("Static block-1");
	}
	
	static{
		System.out.println("Static block-2");
	}
	
	static{
		System.out.println("Static block-3");
	}
	
	static{
		System.out.println("Static block-4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");
	}	
		static{
			System.out.println("Static block-5");
		}

	}

