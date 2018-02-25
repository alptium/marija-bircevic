package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		String operation;
	
		try(Scanner input = new Scanner(System.in)) {
			
			System.out.println("Please enter the first number");
			int n1 = input.nextInt();

			System.out.println("Please enter the second number");
			int n2 = input.nextInt();

			System.out.println("Enter your operation");
			operation = input.next();
	       
			int operationResult = 0;
			switch (operation)  {
	       
			case "+":
				operationResult = (n1 + n2);
				break;

			case "-":
				operationResult = (n1 - n2);
				break;

			case "/":
				operationResult = (n1 / n2);
				break;

			case "*":
				operationResult = (n1 * n2);
				break; 
	        }
	            
			System.out.println("The result is" + " " + operationResult);
	}}}


