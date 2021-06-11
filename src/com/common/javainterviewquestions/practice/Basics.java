package com.common.javainterviewquestions.practice;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PrintInteger();
		addTwoNum();
		multifyTwoFloat();
		asciChar();
		quotientandRemainder();
		swapTwoNumbers();
		// oddOrEven();
		vowelandConsonant();
		largestAmoungThreeNum();
		leapYear();
		positiveAnsNegative();
		alphabetCheck();
		naturalNumSum();
		factorial();
		multiplicationTable();
		fibonacciSeries();
		printChars();
		NumberOfDigits();
		reverseNum();
		PowerConcept();
		palindromNum();
		primeNumInterval();
		armstrongNum();
		factors();
		// calculator();

		checkPrimeNum1(3);
		primeNumext();

		naturalNumSumRecursion();
		FactorialRecursive();

	}

	// Q1. Java Program to Print an Integer (Entered by the User)
	public static void PrintInteger() {

		Scanner reader = new Scanner(System.in);
		System.out.println(" User nneds to enter a input : ");

		int num = reader.nextInt();

		System.out.println(" you entered : " + num);
	}

	// Q2. Java Program to Add Two Integers

	public static void addTwoNum() {

		int a, b, c;
		a = 10;
		b = 20;

		c = a + b;

		System.out.println(" Add two num : " + c);
	}

	// Q3. Java Program to Multiply two Floating Point Numbers

	public static void multifyTwoFloat() {

		float a, b, c;
		a = 10f;
		b = 2.5f;

		c = a * b;

		System.out.println(" Add two num : " + c);
	}

	// Q4. Java Program to Find ASCII Value of a character
	public static void asciChar() {

		char c = 'A';

		int ascii = c;

		int asciinum = (int) c;

		System.out.println(ascii);
		System.out.println(asciinum);

	}

	// Q5. Java Program to Compute Quotient and Remainder

	public static void quotientandRemainder() {

		int dividend = 30;

		int divisor = 6;

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println(quotient);
		System.out.println(remainder);

	}
	// Q6. Java Program to Swap Two Numbers

	public static void swapTwoNumbers() {

		int a = 30;
		int b = 20;

		System.out.println("Before swapping : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println(" After swapping: ");

		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

	// Q7. Java Program to Check Whether a Number is Even or Odd
	public static void oddOrEven() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Pls enter a num: ");

		int num = sc.nextInt();

		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");

	}

	// Q8. Java Program to Check Whether an Alphabet is Vowel or Consonant
	public static void vowelandConsonant() {

		// a, e, i, o, u

		char ch = 'a';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");
		} else {
			System.out.println(ch + " is consonant");
		}

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;
		default:
			System.out.println(ch + " is consonant");

			break;
		}

	}

	// Q9 Java Program to Find the Largest Among Three Numbers

	public static void largestAmoungThreeNum() {

		int x = 100;
		int y = 200;
		int z = 100;

		if (x > y && x > z) {
			System.out.println(" x is greatest ");
		} else if (y > z) {
			System.out.println(" y is greatest ");
		} else {
			System.out.println(" z is greatest ");
		}

		if (x >= y) {
			if (y >= z) {
				System.out.println(" x is greatest ");
			} else {
				System.out.println(" z is greatest ");
			}
		} else {
			if (y >= z) {
				System.out.println(" y is greatest");
			} else {
				System.out.println(" z is greatest");
			}
		}

	}

	public static void leapYear() {

		// divisble by 4 for all the century -- ending with 00
		// century year is leap year when its perfectly divisble by 400

		// 1900 is not a leap year
		// 2012 leap year

		int year = 2000;
		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
			} else {
				leap = true;
			}
		} else {
			leap = false;
		}

		if (leap) {
			System.out.println(year + " leap year ");
		} else {
			System.out.println(year + " not a leap year ");
		}
	}

	public static void positiveAnsNegative() {

		double num = 12.33;

		if (num < 0.0) {
			System.out.println(num + " is a -ve number");
		} else if (num > 0.0) {
			System.out.println(num + " is a +ve number");

		} else {
			System.out.println(num + " is zero");
		}
	}

	public static void alphabetCheck() {

		char c = 't';

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println(c + " is a Alphabet");
		} else {
			System.out.println(c + " is not a Alphabet");

		}
	}

	public static void naturalNumSum() {

		int n = 100;
		int sum = 0;
		int sum1 = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(" Sum is : " + sum);

		int k = 1;
		while (k <= n) {
			sum1 = sum1 + 1;
			k++;
		}
		System.out.println(" Sum is : " + sum);

	}

	public static void factorial() {

		int num = 5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println(" factorial of " + num + " is : " + fact);
	}

	public static void multiplicationTable() {

		int num = 2;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}

	public static void fibonacciSeries() {

		int num = 10;
		int t1 = 0;
		int t2 = 1;

		for (int i = 1; i <= num; i++) {

			System.out.print(t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

	}

	public static void printChars() {

		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c + " ");
		}

	}

	public static void NumberOfDigits() {

		// 1234 -- 4
		// 123 -- 3
		// int num = 3685672
		// long num = 1234 - 4
		// long num =

		int num = 1234;
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(" No of digits: " + count);
	}

	public static void reverseNum() {
		int num = 1234;
		int rev = 0;

		while (num != 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}
		System.out.println(" Reverse num: " + rev);
	}

	public static void PowerConcept() {

		int base = 2;
		int exponent = 4;

		long result = 1;

		while (exponent != 0) {
			result *= base;
			--exponent;
		}
		System.out.println("PowerConcept" + result);

		System.out.println(Math.pow(base, exponent)); // Not recomnded at
														// interivew point of
														// time

	}

	public static void palindromNum() {

		int num = 1331;
		int rev = 0;

		int actualNum = num;

		while (num != 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}
		System.out.println(rev);

		if (actualNum == rev) {
			System.out.println("  is a palindrome : ");
		} else {
			System.out.println("  is not a palindrome : ");
		}
	}

	public static void primeNum() {

		int num = 13;
		boolean flag = false;

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

	public static void primeNumInterval() {

		int low = 20;
		int high = 50;

		while (low < high) {

			boolean flag = false;

			for (int i = 2; i < low / 2; i++) {

				if (low % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(low + " ");
			}
			low++;
		}
	}

	public static void armstrongNum() {
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 25 + 27 = 153

		int num = 153;
		int actualNum = num;
		double result = 0;

		while (actualNum != 0) {

			int n = actualNum % 10;
			result = result + Math.pow(n, 3);
			actualNum = actualNum / 10;
		}
		if (result == num) {
			System.out.println(num + " is a armstrong number");
		} else {
			System.out.println(num + " is not a armstrong number");
		}

	}

	public static void factors() {

		// 10 -> 1,2,5,10
		// 60 -> 1 2 3 4 5 6 10 12 15 20 30 60

		int num = 60;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i + " ");
			}
		}
	}

	public static void calculator() {

		Scanner reader = new Scanner(System.in);

		System.out.println(" Enter two num ");
		double first = reader.nextDouble();
		double second = reader.nextDouble();

		System.out.println(" please enter an operator : ( +, -, *, /): ");

		char operator = reader.next().charAt(0);

		double result = 0;

		switch (operator) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;
		default:
			System.out.println(" Please pass the correct  operator ");
			break;
		}
		System.out.println(result);
	}

	public static boolean checkPrimeNum1(int num) {

		boolean isPrime = true;
		for (int i = 2; i < num / 2; i++) {
			isPrime = false;
			break;
		}
		return isPrime;
	}

	// program is pending

	public static void primeNumext() {
		int num = 34;
		boolean flag = false;

		for (int i = 2; i < num / 2; i++) {
			if (checkPrimeNum1(i)) {
				if (checkPrimeNum1(num - i))
					System.out.println(num + " = " + i + "  + " + (num - i));
				flag = true;
			}

		}
		if (!flag) {
			System.out.println(num + " cannot be expressed as the sum of two prime num ");
		}

	}

	public static void naturalNumSumRecursion() {

		int num = 5;
		int sum = addNum(num);
		System.out.println(" Sum is: " + sum);

	}

	public static int addNum(int num) {

		if (num != 0) {
			return num + addNum(num - 1);
		} else {
			return num;
		}
	}

	public static void FactorialRecursive() {
		System.out.println(multyNum(5));
	}

	public static int multyNum(int num) {

		if (num >= 1) {
			return num * multyNum(num - 1);
		} else {
			return 1;
		}

	}
}
