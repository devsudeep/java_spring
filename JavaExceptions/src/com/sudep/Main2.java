package com.sudep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer#:");

		try {

			int number = scanner.nextInt();
			validate(number);

			System.out.println(number);

		} catch (InputMismatchException e) {
			System.out.println("Local error");

			System.out.println(e.getClass().getPackage());
			System.out.println(e.getCause());
			// TODO: handle exception
			e.printStackTrace();
//			System.out.println("Invalid Entry. Please enter digits only.");
			System.err.println(e.getMessage());
			scanner.next();
		} catch (Exception e) {
			System.out.println("Global error");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Program finished successfully");
		System.out.println("Program finished successfully");
		System.out.println("Program finished successfully");
		System.out.println("Program finished successfully");
		System.out.println("Program finished successfully");
		System.out.println("Program finished successfully");

	}

	public static void validate(int number)  {
		if (number < 0) {
			throw new RuntimeException("Invalid age, age cannot be < 0");
		}

	}
}
