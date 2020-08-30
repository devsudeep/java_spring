package com.sudep;

public class AgeInputException extends Exception {

	private static final String DEFAULT_MESSAGE = "Input out of bounds";

	private int lowerBound;
	private int upperBound;
	private int value;

	public AgeInputException(int low, int high, int input) {
		this(input, low, high, DEFAULT_MESSAGE);
		}
	public AgeInputException(int low, int high, int input, String msg) {
		super(msg);
		if (low > high) {
			throw new IllegalArgumentException();
		}
		System.out.println("snetting values");
		lowerBound = low;
		upperBound = high;
		value = input;
	}

	public int lowerBound() {
		return lowerBound;
	}

	public int upperBound() {
		return upperBound;
	}

	public int value() {
		return value;
	}

}
