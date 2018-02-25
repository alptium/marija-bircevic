package advancedgradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		try(Scanner user_input = new Scanner(System.in)) {
		
		
		int gradeSum = 0;
		
	
		while (true)
		{
			
			String studentFirstName;
			System.out.print("Enter students First name ");
			studentFirstName = user_input.next();
		
			String studentLastName;
			System.out.print("Enter " + studentFirstName + "'s" + " Last Name ");
			studentLastName = user_input.next();
		
			System.out.print("Enter " + studentFirstName + " " + studentLastName + " grade ");
			int studentGrade = user_input.nextInt();

			gradeSum += studentGrade;
			
			System.out.print("Do you  wish to enter new student? (Y/N) ");
			String answer = user_input.next();
	
			if (answer.equals("N"))	
				break;
		
		}
		System.out.print("Grade sum: " + gradeSum);
		}
		
	}}
		