package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		try(Scanner user_input = new Scanner(System.in)) {
		
			System.out.print("Enter 1st students First name ");
			String student1FirstName = user_input.next();
		
			System.out.print("Enter " + student1FirstName + "'s" + " Last Name ");
			String student1LastName = user_input.next();		
			
			System.out.print("Enter " + student1FirstName + " " + student1LastName + " grade ");
			int student1Grade = user_input.nextInt();
		
			System.out.print("Enter 2nd students First name ");
			String student2FirstName = user_input.next();
		
			System.out.print("Enter " + student2FirstName + "'s" + " Last Name ");
			String student2LastName = user_input.next();
					
			System.out.print("Enter " + student2FirstName + " " + student2LastName + " grade ");
			int student2Grade = user_input.nextInt();
		
			System.out.print("Enter 3rd students First name ");
			String student3FirstName = user_input.next();
		
			System.out.print("Enter " + student3FirstName + "'s" + " Last Name ");
			String student3LastName = user_input.next();
					
			System.out.print("Enter " + student3FirstName + " " + student3LastName + " grade ");
			int student3Grade = user_input.nextInt();
		
			System.out.print("Enter 4th students First name ");
			String student4FirstName = user_input.next();
		
			System.out.print("Enter " + student4FirstName + "'s" + " Last Name ");
			String student4LastName = user_input.next();
					
			System.out.print("Enter " + student4FirstName + " " + student4LastName + " grade ");
			int student4Grade = user_input.nextInt();
		
			System.out.print("Enter 5th students First name ");
			String student5FirstName = user_input.next();
		
			System.out.print("Enter " + student5FirstName + "'s" + " Last Name ");
			String student5LastName = user_input.next();
					
			System.out.print("Enter " + student5FirstName + " " + student5LastName + " grade ");
			int student5Grade = user_input.nextInt();
		
			System.out.print("Total grade result is: " + (student1Grade + student2Grade + student3Grade + student4Grade + student5Grade));
		
		}
	}
}
