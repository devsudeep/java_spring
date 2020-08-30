package com.sudeep.modifiers;

public class OtherClass {
	
	public OtherClass() {
		PublicClass pbc = new PublicClass();
		pbc.name = "Sudeep";
		System.out.println(pbc.name);
		AProtectedClass apt = new AProtectedClass();
		apt.name ="Protected";
		
	}
	public void makeProtectedObject() {
		AProtectedClass apt = new AProtectedClass();
		apt.name ="Testing";
	}

	
}
