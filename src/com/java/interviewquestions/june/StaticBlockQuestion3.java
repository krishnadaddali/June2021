package com.java.interviewquestions.june;

//Q3. Diff b/w static block and static method

//Q4. how can we create objects if we make the constructor private

public class StaticBlockQuestion3 {

	int age;

	static {
		StaticBlockQuestion3 obj1 = new StaticBlockQuestion3();
	}

	public static int creatObject() {

		StaticBlockQuestion3 obj1 = new StaticBlockQuestion3();

		obj1.age = 40;

		return obj1.age;

	}

	private StaticBlockQuestion3() { // this is access only within class
		age = 30;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticBlockQuestion3 obj = new StaticBlockQuestion3();

		System.out.println(obj.age);

	}

}
