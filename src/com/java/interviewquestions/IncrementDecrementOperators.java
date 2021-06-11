package com.java.interviewquestions;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 10;
		int y = 20;
		
		x++;
		
		System.out.println("x = "+ x++);
		System.out.println("y = "+ y++);
		
		System.out.println("x = "+ x--);
		System.out.println("y = "+ y--);
		System.out.println("y = "+ (y-x));
		System.out.println("x = "+ (x-y));

		System.out.println("******************");
		
		int i = 10;  
		i++;  
		//prints 11  
		System.out.println(i);  
		++i;                 
		//prints 12  
		System.out.println(i);  
		//prints 13  
		System.out.println(++i);  
		//prints 13  
		System.out.println(i++);  
		//prints 14  
		System.out.println(i); 
	}

}
