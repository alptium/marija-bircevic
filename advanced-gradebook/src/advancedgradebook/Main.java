package advancedgradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner user_input=new Scanner(System.in);
		
	String student1_FirstName;
	System.out.print("Enter 1st students First name ");
	student1_FirstName=user_input.next();
	
	String student1_LastName;
	System.out.print("Enter " + student1_FirstName + "'s" + " Last Name ");
	student1_LastName=user_input.next();
	
	int student1_Grade;
	System.out.print("Enter " + student1_FirstName + " " + student1_LastName + " grade ");
	student1_Grade=user_input.nextInt();
	
	String student2_FirstName;
	System.out.print("Enter 2nd students First name ");
	student2_FirstName=user_input.next();
	
	String student2_LastName;
	System.out.print("Enter " + student2_FirstName + "'s" + " Last Name ");
	student2_LastName=user_input.next();
	
	int student2_Grade;
	System.out.print("Enter " + student2_FirstName + " " + student2_LastName + " grade ");
	student2_Grade=user_input.nextInt();
	
	String student3_FirstName;
	System.out.print("Enter 3rd students First name ");
	student3_FirstName=user_input.next();
	
	String student3_LastName;
	System.out.print("Enter " + student3_FirstName + "'s" + " Last Name ");
	student3_LastName=user_input.next();
	
	int student3_Grade;
	System.out.print("Enter " + student3_FirstName + " " + student3_LastName + " grade ");
	student3_Grade=user_input.nextInt();
	
	String student4_FirstName;
	System.out.print("Enter 4th students First name ");
	student4_FirstName=user_input.next();
	
	String student4_LastName;
	System.out.print("Enter " + student4_FirstName + "'s" + " Last Name ");
	student4_LastName=user_input.next();
	
	int student4_Grade;
	System.out.print("Enter " + student4_FirstName + " " + student4_LastName + " grade ");
	student4_Grade=user_input.nextInt();
	
	String student5_FirstName;
	System.out.print("Enter 5th students First name ");
	student5_FirstName=user_input.next();
	
	String student5_LastName;
	System.out.print("Enter " + student5_FirstName + "'s" + " Last Name ");
	student5_LastName=user_input.next();
	
	int student5_Grade;
	System.out.print("Enter " + student5_FirstName + " " + student5_LastName + " grade ");
	student5_Grade=user_input.nextInt();
	
	System.out.print("Total grade resault is: " + (student1_Grade + student2_Grade + student3_Grade + student4_Grade + student5_Grade));
	
}

}
