package com.spring.springpropertyeditors;

public class CustomEditorExample {

	private FullName name;

	public FullName getName() {

		return name;
	}

	public void setName(FullName name) {
		System.out.println("Setting Full name form property");
		this.name = name;
	}

}
