package com.sudeep.funcinerface;

public class funinter_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber myNum;

		myNum = () -> 12.14;
		System.out.println(myNum.getValue());
		System.out.println(myNum.getClass());
		myNum = () -> Math.random() * 100;
		System.out.println(myNum.getValue());

		NumberTest isEven = (n) -> n % 2 == 0;

		System.out.println(isEven.test(100));

		System.out.println(isEven.test(111));

	}

}
