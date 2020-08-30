package com.sudeep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sudeep.interfaceImpl.ClassGenericSeveralTypeImpl;
import com.sudeep.interfaceImpl.ClassImplementingGenericInterface;
import com.sudeep.interfaceImpl.ClassImplemtationIntInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassImplementingGenericInterface cigi = new ClassImplementingGenericInterface();
		
		cigi.performAction("I am single parameter type ");
		
		ClassImplemtationIntInterface cint = new ClassImplemtationIntInterface();
		cint.performAction(1234);
		
		ClassGenericSeveralTypeImpl cgsti = new ClassGenericSeveralTypeImpl();
		
		System.out.println(cgsti.performAction("Sudeep Palel"));
		
		final List< Long > longs = new ArrayList<>();
		final List< Long > longs1 = new ArrayList<>();
		longs.add(0L);
		
 	}
//	static void sort( Collection< String > strings ) {
//		// Some implementation over strings heres
//		}
//	static	void sort( Collection< Number > numbers ) {
//		// Some implementation over numbers here
//		}
}
