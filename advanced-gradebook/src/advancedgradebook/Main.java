package advancedgradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner userInput = new Scanner(System.in)) {

			int gradeSum = 0;

			while (true) {

				System.out.print("Enter students First name ");
				String studentFirstName = userInput.next();

				System.out.print("Enter " + studentFirstName + "'s" + " Last Name ");
				String studentLastName = userInput.next();

				System.out.print("Enter " + studentFirstName + " " + studentLastName + " grade ");
				int studentGrade = userInput.nextInt();

				gradeSum += studentGrade;

				System.out.print("Do you  wish to enter new student? (Y/N) ");
				String answer = userInput.next();

				if (answer.equals("N"))
					break;
			}

			System.out.print("Grade sum: " + gradeSum);
		}
	}
}
