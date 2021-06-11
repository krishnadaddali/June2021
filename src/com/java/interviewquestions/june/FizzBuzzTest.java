package com.java.interviewquestions.june;

public class FizzBuzzTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fizzBuzz();
	}
	
	public static void fizzBuzz(){
		
		for(int i=1; i<=100; i++)
		{
			String num="";

			if(i%3==0)
			  num+="Fizz";
			if(i%5==0)
			  num+="Buzz";
			if(num.length()==0)
			  num=Integer.toString(i);

			System.out.println(num);
		}
	}

}
