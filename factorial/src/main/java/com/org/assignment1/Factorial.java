package com.org.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {
	
	 private Scanner scanner;
	 private PrintStream printStream;
	 private int num;
	 

	 public Factorial(InputStream inputStream, PrintStream printStream) {
	      this.scanner = new Scanner(inputStream);
	      this.printStream = printStream;
	 }
	 
	 public int isInputNumberValid()  {
		if (this.scanner.hasNextInt()) {
			this.num = this.scanner.nextInt();
			if (this.num >= 1 && this.num <= 10) {
				return this.num;
			}
		} else if (this.scanner.hasNext()) {
			this.scanner.next();
		}

		this.printStream.println(
				"Invalid entry. Please enter an integer between 1 and 10, inclusive.");
		return -1;
	 }
	
	 
	 private void calculateFactorial(int num) {
		
		int result = 1;
		for (int factor = 2; factor <= num; factor++) {
			result *= factor;
		}
		this.printStream.println("The Factorial is: " + result);
		
	 }
	 
	 public void calculateFactorial() {
		 /*
		 Do not change this method.
		 */
		 	
		 int input = this.isInputNumberValid();
		 if(input != -1)
		 {
			 calculateFactorial(input);
		 }
		 
	 }
	

	 public static void main(String[] args) { 
		/*
		 Do not change this method.
		 */
		Factorial fact = new Factorial(System.in,System.out);
		System.out.println("Enter an integer between 1 and 10, inclusive.");
		fact.calculateFactorial();	
	 }

	
}
