package com.sudeep.interfaceImpl;

import com.sudeep.interfaces.GenericInterfaceOneType;

public class ClassImplemtationIntInterface implements GenericInterfaceOneType<Integer>{

	@Override
	public void performAction(Integer action) {
		// TODO Auto-generated method stub
//		if(action instanceof T) {
//			
//		}
		System.out.println(action);
	}
	
}