package com.wiley.assignment1;

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
		 
		//1. Write the Java Code to accept the valid number from the user and store in an instance variable "num".
		//2. Use the Instance variable "scanner" to accept the input from the user.
		//3. In case of valid input, return back the number.
		//4. To print on console, use this.printStream.print() and NOT the System.out.println()
		//5. In case of invalid input, print on console exactly as below :- 
		//   "Please Enter valid Input as number between 1 and 10 only, both inclusive".
		//   and return back -1
		 
			 /*
			PLEASE INSERT YOUR CODE STRICTLY BETWEEN BELOW COMMENTED LINES
			YOUR CODE STARTS HERE
			YOUR CODE ENDS HERE
			AS TEST CASES ARE EXECUTED USING AUTOMATION TECHNIQUE, REQUEST TO
			STRICTLY FOLLOW BELOW MENTIONED RULES
				1. THE REST OF THE CODE PROVIDED TO YOU SHOULD BE KEPT STRICTLY UNTOUCHED.
				2. YOUR OWN CODE WOULD COME ONLY INSIDE ABOVE-MENTIONED PAIR OF COMMENTS.
				3. THE CLASS NAMES, INTERFACE NAMES, METHOD SIGNATURES AND ATTRIBUTE NAMES SHOULD
   					NOT BE ALTERED OR MODIFIED AND KEPT STRICTLY UNTOUCHED.
				4. PLEASE FOLLOW STANDARD JAVA NAMING CONVENTIONS FOR THE PIECE OF CODE YOU
   					ARE GOING TO PROVIDE INSIDE THE BELOW-MENTIONED PAIR OF COMMENTS.
					*/

 

		//YOUR CODE STARTS HERE

 

		//YOUR CODE ENDS HERE
		 
			
	 }
	
	 
	 private void calculateFactorial(int num) {
		
		int result = 1;
		
		  /*
		PLEASE INSERT YOUR CODE STRICTLY BETWEEN BELOW COMMENTED LINES
		YOUR CODE STARTS HERE
		YOUR CODE ENDS HERE
		AS TEST CASES ARE EXECUTED USING AUTOMATION TECHNIQUE, REQUEST TO
		STRICTLY FOLLOW BELOW MENTIONED RULES
			1. THE REST OF THE CODE PROVIDED TO YOU SHOULD BE KEPT STRICTLY UNTOUCHED.
			2. YOUR OWN CODE WOULD COME ONLY INSIDE ABOVE-MENTIONED PAIR OF COMMENTS.
			3. THE CLASS NAMES, INTERFACE NAMES, METHOD SIGNATURES AND ATTRIBUTE NAMES SHOULD
   				NOT BE ALTERED OR MODIFIED AND KEPT STRICTLY UNTOUCHED.
			4. PLEASE FOLLOW STANDARD JAVA NAMING CONVENTIONS FOR THE PIECE OF CODE YOU
   				ARE GOING TO PROVIDE INSIDE THE BELOW-MENTIONED PAIR OF COMMENTS.
		*/
		
		//YOUR CODE STARTS HERE

 

		//YOUR CODE ENDS HERE
		this.printStream.print("The Factorial is: " + result);		
		
	 }
	 
	 public void calculateFactorial() {
		 	
		 int input = this.isInputNumberValid();
		 if(input != -1)
		 {
			 calculateFactorial(input);
		 }
		 
	 }
	

	 public static void main(String[] args) {  
		Factorial fact = new Factorial(System.in,System.out);
		System.out.println("Enter any number between 1 and 10, both inclusive");
		fact.calculateFactorial();	
	 }

	
}
