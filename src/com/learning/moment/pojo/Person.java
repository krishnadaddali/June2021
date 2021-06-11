package com.learning.moment.pojo;

public class Person {

	int id;
	String name;
	String state;

	public Person(int id, String name, String state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", state=" + state + "]";
	}
	

}
