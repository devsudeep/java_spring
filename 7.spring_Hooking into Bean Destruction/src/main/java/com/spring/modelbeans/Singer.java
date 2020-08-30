package com.spring.modelbeans;

public class Singer {

	private static final String DEFAULT_NAME = "Eric Clapton";
	private String name;
	private int age;

	public void init() {
		// TODO Auto-generated method stub

		System.out.println("Initializing Bean");
		if (name == null) {
			System.out.println("Setting up default name");
			name = DEFAULT_NAME;

		}
		System.out.println("Setting age and checking");
		System.out.println(age);
		System.out.println(Integer.MIN_VALUE);
		if (age == 0) {
			throw new IllegalArgumentException("You must set the age property of any beans of type " + Singer.class);
		}
	}

	public String toString() {
		return "\tName: " + name + "\n\tAge: " + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
