package com.java.interviewquestions.june;

public interface Car {
	
	// only final & static var 
	
	final int wheels = 4;
	
	// Always define only abstract methods
	// no method body
	// only method declaration 
	// we achieve 100% abstraction 
	// Cannot create obj of intefaces as well 
	
	public void start();
	public void stop();
	public void refuel();

}
