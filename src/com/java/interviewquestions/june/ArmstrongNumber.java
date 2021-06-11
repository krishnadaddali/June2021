package com.java.interviewquestions.june;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 15 == 1*1*1 5*5*5 3*3*3

		isArmstrongNumber(153);

	}

	public static void isArmstrongNumber(int input) {

		int cube = 0;
		int r;
		int t;

		t = input;

		while (input > 0) {
			r = input % 10;
			input = input / 10;
			cube = cube + (r * r * r);

		}

		if (t == cube) {
			System.out.println("this is an ArmstrongNumber");
		} else {
			System.out.println("this is not a ArmstrongNumber");
		}
	}

}
