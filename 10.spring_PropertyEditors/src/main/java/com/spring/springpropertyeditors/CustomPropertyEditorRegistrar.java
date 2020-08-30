package com.spring.springpropertyeditors;

import java.beans.PropertyEditor;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;

public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		// TODO Auto-generated method stub

		SimpleDateFormat dateFormmater = new SimpleDateFormat("MM/dd/yyyy");
		registry.registerCustomEditor(Date.class, new CustomDateEditor(dateFormmater, true));
		registry.registerCustomEditor(String.class, new StringTrimmerEditor(true));

	}

}
