package elitesportsteamselector;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome, this is application for professional swimmers!");
		System.out.println("Please, follow the instructions and fill in the application.");

		runDemoswimmer();
	}

	private static void runDemoswimmer() {
		System.out.println("Add new swimmer");
		System.out.println();

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {

				System.out.print(" Please insert swimmer's registration number");
				int swimmerRegistrationNumber = sc.nextInt();

				System.out.print("Please enter swimmer's First name: ");
				String swimmerFirstName = sc.next();

				System.out.print("Please enter " + swimmerFirstName + "'s" + " Last Name: ");
				String swimmerLastName = sc.next();

				System.out.print("Please enter " + swimmerFirstName + " " + swimmerLastName + " age: ");
				int swimmerAge = sc.nextInt();

				System.out.println("What is swimmer's gender? (M/F)");
				String swimmerGender = sc.next();

				System.out.println("What is swimmer's style? (crawl/breaststroke)");
				String swimmerStyle = sc.next();

				System.out.print("Please enter swimmer's starting speed:");
				int swimmerStartingSpeed = sc.nextInt();

				System.out.print("Please enter swimmer's speed turns:");
				int swimmerSpeedTurns = sc.nextInt();

				if (swimmerAge < 16 && swimmerGender == ("F")) {
					System.out.println("Sorry, the application is REJECTED");
					
				} else if (swimmerStartingSpeed > 6 && swimmerSpeedTurns > 3) {
					System.out.println("Sorry, the application is REJECTED");

				} else {
					System.out.println("Congratulations, the application is ACCEPTED");
				}

			}
		}
	}
}
