package com.sudeep.stringbuffers;

import java.util.function.Consumer;

public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sudeep Patelr";
		System.out.println(str + str.length());
//		str.charAt(13, "B");g

		StringBuffer sbuf = new StringBuffer("Java Buffers");
		System.out.println(Integer.toHexString(sbuf.hashCode()));
		sbuf.setCharAt(1, 'J');
		System.out.println(sbuf);
//		String str1 = () -> {new String("Sudeep");};
 
	
	}

}
