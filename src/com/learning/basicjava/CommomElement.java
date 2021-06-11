package com.learning.basicjava;

public class CommomElement {

	public static void main(String args[]) {

		commomNames();

	}

	public static void commomNames() {

		String[] s1 = { "raj", "krih", "dff", "fgg", "rgrg" };
		String[] s2 = { "raj" };

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					System.out.println(s1[i] + " ");
					break;
				}
			}
		}
	}
}
