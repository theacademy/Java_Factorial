package com.org.assignment1;

import java.util.Scanner;

public class Factorial {

	private final Scanner scanner = new Scanner(System.in);
	private int num;

	public int isInputNumberValid() {
		if (this.scanner.hasNextInt()) {
			this.num = this.scanner.nextInt();
			if (this.num >= 1 && this.num <= 10) {
				return this.num;
			}
		} else if (this.scanner.hasNext()) {
			this.scanner.next();
		}

		System.out.println(
				"Invalid entry. Please enter an integer between 1 and 10, inclusive.");
		return -1;
	}

	private void calculateFactorial(int number) {
		int result = 1;
		for (int factor = 2; factor <= number; factor++) {
			result *= factor;
		}
		System.out.println("The Factorial is: " + result);
	}

	public void calculateFactorial() {
		int input = this.isInputNumberValid();
		if (input != -1) {
			this.calculateFactorial(input);
		}
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println("Enter an integer between 1 and 10, inclusive.");
		factorial.calculateFactorial();
	}
}
