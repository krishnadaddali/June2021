package com.java.interviewquestions.june;

public class MissingNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int a[] = {1,2,3,4,6}
		// 1+2+3+4+6 = 16
		// 1+2+3+4+5+6 = 21
		
		int a[] = {1,2,3,4,6};
		
		int sum = 0;
		for(int i=0; i<a.length; i++){
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		int sum1= 0;
		for(int j=1; j<=6; j++){
			sum1 = sum1 + j;
		}
		
		System.out.println(sum1);
		
		System.out.println(" Missing Num : " +(sum1-sum));
	}
	
	

}
