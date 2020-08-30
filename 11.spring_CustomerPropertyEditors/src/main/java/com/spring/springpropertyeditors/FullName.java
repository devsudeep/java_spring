package com.spring.springpropertyeditors;

public class FullName {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("setting full name  executing...................");
	
		this.firstName = firstName;
					System.out.println("setting firstName  executing...................");
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
			System.out.println("setting lastName  executing...................");
	
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "FullName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public FullName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	

}
