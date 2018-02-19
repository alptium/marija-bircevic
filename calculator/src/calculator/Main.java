package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  	int n1;
	        int n2;
	        String operation;


	        Scanner input = new Scanner(System.in);

	        try(Scanner sc = new Scanner(System.in)) {
	        
	        System.out.println("Please enter the first number");
	       n1 = input.nextInt();

	        System.out.println("Please enter the second number");
	        
	       n2 = input.nextInt();

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
	}}
}

