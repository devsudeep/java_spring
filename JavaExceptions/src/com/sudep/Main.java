package com.sudep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer#:");

		try {
			int number = scanner.nextInt();
			System.out.println(number);
			if (number < 0) {
				throw new Exception("Invalid age, age cannot be < 0");
			}

		} catch (InputMismatchException e) {
			System.out.println("Local error");

			System.out.println(e.getClass().getPackage());
			System.out.println(e.getCause());
			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println("Invalid Entry. Please enter digits only.");
			System.err.println(e.getMessage());
			scanner.next();
		} catch (Exception e) {
			System.out.println("Global error");
			System.err.println(e.getMessage());
		}

		System.out.println("Program finished successfully");
		System.out.println("Program finished successfully");
		System.out.println("Program finished successfully");
		System.out.println("Program finished successfully");
		System.out.println("Program finished successfully");
		System.out.println("Program finished successfully");

	}

}
