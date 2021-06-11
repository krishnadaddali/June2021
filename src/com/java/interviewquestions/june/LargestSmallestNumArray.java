package com.java.interviewquestions.june;

import java.util.Arrays;

public class LargestSmallestNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {-9, -4, 0, 2, 5, 7, 11};
		
		int largest = num[0];
		int smallest = num[0];
		
		for(int i = 1; i <num.length; i++){
			if(num[i]>largest){
				largest = num[i];
			}
			else if(num[i]<smallest)
				smallest = num[i];
			}
		
		System.out.println(" Given array is : " + Arrays.toString(num));
		System.out.println(" Largest num is : " + largest);
		System.out.println(" Smallest num is : " + smallest);

	}
	
	

}
