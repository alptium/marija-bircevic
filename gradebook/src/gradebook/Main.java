package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		try(Scanner userInput = new Scanner(System.in)) {
		
			System.out.print("Enter 1st students First name ");
			String student1FirstName = userInput.next();
		
			System.out.print("Enter " + student1FirstName + "'s" + " Last Name ");
			String student1LastName = userInput.next();		
			
			System.out.print("Enter " + student1FirstName + " " + student1LastName + " grade ");
			int student1Grade = userInput.nextInt();
		
			System.out.print("Enter 2nd students First name ");
			String student2FirstName = userInput.next();
		
			System.out.print("Enter " + student2FirstName + "'s" + " Last Name ");
			String student2LastName = userInput.next();
					
			System.out.print("Enter " + student2FirstName + " " + student2LastName + " grade ");
			int student2Grade = userInput.nextInt();
		
			System.out.print("Enter 3rd students First name ");
			String student3FirstName = userInput.next();
		
			System.out.print("Enter " + student3FirstName + "'s" + " Last Name ");
			String student3LastName = userInput.next();
					
			System.out.print("Enter " + student3FirstName + " " + student3LastName + " grade ");
			int student3Grade = userInput.nextInt();
		
			System.out.print("Enter 4th students First name ");
			String student4FirstName = userInput.next();
		
			System.out.print("Enter " + student4FirstName + "'s" + " Last Name ");
			String student4LastName = userInput.next();
					
			System.out.print("Enter " + student4FirstName + " " + student4LastName + " grade ");
			int student4Grade = userInput.nextInt();
		
			System.out.print("Enter 5th students First name ");
			String student5FirstName = userInput.next();
		
			System.out.print("Enter " + student5FirstName + "'s" + " Last Name ");
			String student5LastName = userInput.next();
					
			System.out.print("Enter " + student5FirstName + " " + student5LastName + " grade ");
			int student5Grade = userInput.nextInt();
		
			System.out.print("Total grade result is: " + (student1Grade + student2Grade + student3Grade + student4Grade + student5Grade));
		
		}
	}
}
