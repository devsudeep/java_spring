package com.sudeep.funcinerface;

public class GenericFuncInterfaceMain {

	public static void main(String[] args) {
		GenericFuncInterface<String> printString = (str) -> {
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				System.out.println(str.charAt(i));
				result = str;
			}
			System.out.println(str);
			return result;
		};

		System.out.println(printString.func("Sudeep"));

	}
}
