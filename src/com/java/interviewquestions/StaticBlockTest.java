package com.java.interviewquestions;

public class StaticBlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Main.x);

	}

}

class Main{
	public static final int x = 100;
	
	//public static  int x = 100;

static{
	System.out.println("main -- class static block");
}
}


