package com.java.interviewquestions.june;

public class StaticBlockQuestionNo7 {

	// Will static block be executed in the following code ? Why?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Test.x);

		System.out.println(new Test1().x);
		
		

	}
}

class Test {
	static {
		System.out.println(" Test --  static block ");
	}
	public static final int x = 20;

}

class Test1 {
	static {
		System.out.println(" Test --  static block ");
	}
	public final int x = 20; // without static

}

