package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		String student1FirstName;
		System.out.print("Enter 1st students First name ");
		student1FirstName = user_input.next();
	
		String student1LastName;
		System.out.print("Enter " + student1FirstName + "'s" + " Last Name ");
		student1LastName = user_input.next();
	
		int student1Grade;
		System.out.print("Enter " + student1FirstName + " " + student1LastName + " grade ");
		student1Grade = user_input.nextInt();
	
		String student2FirstName;
		System.out.print("Enter 2nd students First name ");
		student2FirstName = user_input.next();
	
		String student2LastName;
		System.out.print("Enter " + student2FirstName + "'s" + " Last Name ");
		student2LastName = user_input.next();
	
		int student2Grade;
		System.out.print("Enter " + student2FirstName + " " + student2LastName + " grade ");
		student2Grade = user_input.nextInt();
	
		String student3FirstName;
		System.out.print("Enter 3rd students First name ");
		student3FirstName = user_input.next();
	
		String student3LastName;
		System.out.print("Enter " + student3FirstName + "'s" + " Last Name ");
		student3LastName = user_input.next();
	
		int student3Grade;
		System.out.print("Enter " + student3FirstName + " " + student3LastName + " grade ");
		student3Grade = user_input.nextInt();
	
		String student4FirstName;
		System.out.print("Enter 4th students First name ");
		student4FirstName = user_input.next();
	
		String student4LastName;
		System.out.print("Enter " + student4FirstName + "'s" + " Last Name ");
		student4LastName = user_input.next();
	
		int student4Grade;
		System.out.print("Enter " + student4FirstName + " " + student4LastName + " grade ");
		student4Grade = user_input.nextInt();
	
		String student5FirstName;
		System.out.print("Enter 5th students First name ");
		student5FirstName = user_input.next();
	
		String student5LastName;
		System.out.print("Enter " + student5FirstName + "'s" + " Last Name ");
		student5LastName = user_input.next();
	
		int student5Grade;
		System.out.print("Enter " + student5FirstName + " " + student5LastName + " grade ");
		student5Grade = user_input.nextInt();
	
		System.out.print("Total grade result is: " + (student1Grade + student2Grade + student3Grade + student4Grade + student5Grade));
	
}

}
