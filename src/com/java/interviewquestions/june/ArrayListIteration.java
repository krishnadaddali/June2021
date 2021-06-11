package com.java.interviewquestions.june;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> student = new ArrayList<>();
		student.add("Sim");
		student.add("Tim");
		student.add("Kim");
		student.add("Sam");
		student.add("Ram");
		
		// Using Java 8 with for each loop and lamda exp
		
		student.forEach(stu -> {
			
			System.out.println(stu);
			
		});
		
		System.out.println("****************");
		
		// 2 Using iterator
		
		Iterator<String> studentlist = student.iterator();
		
		while(studentlist.hasNext()){
			String student1 = studentlist.next();
			System.out.println(student1);
		}
		
		// 3. using iterator and java 8 lamda & forEachRemaing() method
		
		System.out.println(" print using java - 8 lamda & forEachRemaing() method");
		
		studentlist =  student.iterator();
		studentlist.forEachRemaining(stu -> {
			System.out.println(stu);
		});
		
		// Usign for each loop
		System.out.println("********** Using for each loop ******");
		
		for(String stu: student){
			System.out.println(stu);
		}
		
		//using for loop with order/index
		System.out.println("##### Print using for loop with order/index ####");
		for(int i=0; i<student.size(); i++){
			System.out.println(student.get(i));
		}
		
		//6 using a listIterator to traverse both directions
		System.out.println("@@@@@@ Using listIterator to traverse both direction @@@@@@@ ");
		ListIterator<String> studentinfo = student.listIterator(student.size());
		while(studentinfo.hasPrevious()){
			String stu = studentinfo.previous();
			System.out.println(stu);
		}
	}

}
