package com.sudeep.modifiers;


import com.sudeep.modifiers.newpackage.NewClass;

/**
 * @author sudeep
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OtherClass otc = new OtherClass();
		AProtectedClass apt = new AProtectedClass();
		
		apt.name ="Protected";
		System.out.println(apt.name);
		
		NewClass nc = new NewClass();
		nc.name = "subclassed";
		System.out.println(nc.name);
		System.out.println(ClassVariables.getStaticVar());
		
		ClassVariables cv = new ClassVariables();
		
		ClassVariables.counter = ClassVariables.counter + 1;
		
		System.out.println(cv.getCounter());
		
		ClassVariables cv1 = new ClassVariables();
		ClassVariables.counter = ClassVariables.counter + 1;
		
		System.out.println(cv1.getCounter());
		try {
			Thread.sleep(600000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ProtectedClass pt = new ProtectedClass();
		System.out.println(pt.getCounter());
		
	}

}
