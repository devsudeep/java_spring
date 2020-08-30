package com.sudep;

public class CustomExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			throw new AgeInputException(10, 50, 100, "Error");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
