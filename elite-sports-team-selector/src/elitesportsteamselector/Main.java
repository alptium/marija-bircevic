package elitesportsteamselector;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome, this is application for professional swimmers!");
		System.out.println("Please, follow the instructions and fill in the application.");
		System.out.println("Add new swimmer");
		System.out.println();

		ArrayList<Swimmer> acceptedSwimmer = new ArrayList<>();
		ArrayList<Swimmer> rejectedSwimmer = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {

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

				Swimmer swimmer = new Swimmer(swimmerFirstName, swimmerLastName, swimmerAge, swimmerStyle,
						swimmerGender, swimmerStartingSpeed, swimmerSpeedTurns);

				if (swimmer.getage() < 16 || swimmer.getgender() == ("F") || swimmer.getstyle() == ("breaststroke")
						|| swimmer.getstartingSpeed() > 6 || swimmer.getspeedTurns() > 3) {
					System.out.println("Sorry, the application is REJECTED");
					System.out.println();
					rejectedSwimmer.add(swimmer);

				} else {
					System.out.println("Congratulations, the application is ACCEPTED");
					System.out.println();
					acceptedSwimmer.add(swimmer);
				}

				System.out.println("Do you want to enter a new swimmer? yes/no");
				System.out.println();

				String exit = sc.next();

				if (exit.equals("no")) {
					break;
				} else
					while (!exit.equals("no") && !exit.equals("yes")) {
						System.out.println("You entered the wrong word, plase response with yes or no!");
						System.out.println("Do you want to enter a new swimmer? yes/no");
						System.out.println();
						exit = sc.next();
					}

				if (exit.equals("no")) {
					break;
				}
			}

			System.out.println("List of accepted swimmers:");
			System.out.println();

			int i = 1;

			for (Swimmer swimmer : acceptedSwimmer) {
				System.out.println("" + i + "." + "\t" + swimmer.getFirstName() + "\t" + swimmer.getLastName());
				i++;
			}

			System.out.println("List of rejected candidates:");
			System.out.println();

			int j = 1;

			for (Swimmer swimmer : rejectedSwimmer) {
				System.out.println("" + j + "." + "\t" + swimmer.getFirstName() + "\t" + swimmer.getLastName());
				j++;
			}

			int acceptedSwimmerCount = acceptedSwimmer.size();
			int rejectedSwimmerCount = rejectedSwimmer.size();
			int totalSwimmerCount = acceptedSwimmerCount + rejectedSwimmerCount;

			double acceptedSwimmerPercent = (double) acceptedSwimmerCount * 100 / totalSwimmerCount;
			double rejectedSwimmerPercent = (double) rejectedSwimmerCount * 100 / totalSwimmerCount;

			System.out.println();
			System.out.println("Total number of applied candidates is: " + totalSwimmerCount);
			System.out.println("Total number of candidates that were accepted is " + acceptedSwimmerCount
					+ ", that makes" + "\t" + acceptedSwimmerPercent + "%");
			System.out.println("Total number of candidates that were rejected is " + rejectedSwimmerCount
					+ ", that makes" + "\t" + rejectedSwimmerPercent + "%");

		}
	}
}
