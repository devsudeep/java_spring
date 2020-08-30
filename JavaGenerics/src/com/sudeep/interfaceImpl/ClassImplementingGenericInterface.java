package com.sudeep.interfaceImpl;

import com.sudeep.interfaces.GenericInterfaceOneType;

public class ClassImplementingGenericInterface implements GenericInterfaceOneType<String> {

	@Override
	public void performAction(final String action) {
		// TODO Auto-generated method stub
		System.out.println("String Parameter:" + action);
	}

	
}


