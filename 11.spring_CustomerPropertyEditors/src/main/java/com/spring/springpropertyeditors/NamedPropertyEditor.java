package com.spring.springpropertyeditors;

import java.beans.PropertyEditorSupport;

public class NamedPropertyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		String[] name = text.split("\\s");
		System.out.println("Customer exitor executing...................");
		setValue(new FullName(name[0], name[1]));
		
		
	}

}