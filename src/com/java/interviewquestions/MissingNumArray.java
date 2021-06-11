package com.java.interviewquestions;

public class MissingNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1,2,4,5 = 12
		// 1 + 2 + 3 + 4 + 5 = 15

		// fn = n(n+1)%2 = 5(5+1)%2 = 15 --> 15 - 12 = 3 is the missing Num
		//

		int num[] = { 1, 2, 3, 5 };

		int n1 = findMissingNum(num, 5);

		System.out.println("missing num in the array : " + n1);

	}

	public static int findMissingNum(int num[], int totalCount) {

		int expSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;

		for (int i : num) {

			actualSum += i;
		}
		return expSum - actualSum;
	}

}
