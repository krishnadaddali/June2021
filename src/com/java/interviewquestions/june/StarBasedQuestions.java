package com.java.interviewquestions.june;

public class StarBasedQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("*****************");
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
			
			

		}
		
		System.out.println("*********************");
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();

		}
		
		System.out.println("************************");
		
		int alpha = 65;            // a= 97 small letters
		for(int i=0; i<=5; i++){
			for(int j=0; j<=i; j++){
				System.out.print((char)(alpha + j ) + " "); // 65 + A = 65
			}
			System.out.println();
		}

	}

}
