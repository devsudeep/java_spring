package com.sudeep.interfaceImpl;

import com.sudeep.interfaces.GenericInterfacSeveralTypes;

public class ClassGenericSeveralTypeImpl implements GenericInterfacSeveralTypes<String, String> {

	@Override
	public String performAction(String action) {
		// TODO Auto-generated method stub
		return "Value:" + action;
	}

	
}
