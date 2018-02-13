package calculator;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		  	int n1;
	        int n2;
	        String operation;


	        Scanner input = new Scanner(System.in);

	        System.out.println("please enter te first number");
	       n1 =input.nextInt();

	        System.out.println("please enter the second number");
	        
	       n2 = input.nextInt();

	        Scanner op = new Scanner(System.in);
	        System.out.println("Enter your operation");
	        operation = input.next();

	        switch (operation)  {
            case "+":
                System.out.println("Your answer is " + (n1 + n2));
                break;

            case "-":
                System.out.println("Your answer is " + (n1 - n2));
                break;

            case "/":
                System.out.println("Your answer is " + (n1 / n2));
                break;

            case "*":
                System.out.println("Your asnwer is " + (n1 * n2));
                break;


            }

	}

}
