package com.sudeep.modifiers;

public class ClassVariables {
	static String staticvar = "I am astic var";
	static String var = "I am not static var";
	static int counter = 0;
 	
	static String getStaticVar() {
		return var;
	}
	
	int getCounter() {
		return counter;
	}
}
