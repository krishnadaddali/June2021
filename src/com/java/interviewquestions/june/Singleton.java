package com.java.interviewquestions.june;

public class Singleton {

	// In OOP, a singleton class is a class that can only one Obj(instance of a
	// class) at a time
	// how to design singleton
	// 1. make constructor as private
	// 2. write a static method that as retrun type of obj of this singleton
	// class(Lazy intialization)
	
	// Diff Normal class & Singleton class
	// For Normal class we use constructor where as for singleton class we use getInstance method for instantion

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = " Hey, I'm using singleton class pattern ";

	}

	public static Object getInstance() {

		if (singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton x = singleton_instance;
		Singleton y = singleton_instance;
		Singleton z = singleton_instance;

		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		

	}

}
