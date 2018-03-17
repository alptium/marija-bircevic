package bankloan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Bank loan application");
		System.out.println("Enter the client's data to verify his creditworthiness");

		runClient();

	}

	private static void runClient() {

		ArrayList<Client> clientList = new ArrayList<Client>();

		double totalSalary = 0;
		int countMarried = 0;
		int countEmployee = 0;
		int countCredit = 0;
		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				System.out.println("Please enter client's first name:");
				String firstName = sc.next();
				System.out.println("Please enter client's last name:");
				String lastName = sc.next();
				System.out.println("Age of the client:");
				int age = sc.nextInt();
				System.out.println("Please enter client's salary:");
				double salary = sc.nextInt();
				System.out.println("Is he/she married? (if Yes enter Y, if No enter N) ");
				boolean isMarried = sc.nextBoolean();
				System.out.println("Is he/she full time employee? (if Yes enter Y, if No enter N)");
				boolean isFullTimeEmployee = sc.nextBoolean();

				System.out.println("For what purpose you need a loan?");
				System.out.println("If you need cash loan enter number 1");
				System.out.println("If you need house loan enter number 2");
				System.out.println("If you need car loan enter number 3");
				int credit = sc.nextInt();

				Client client = new Client(firstName, lastName, age, salary, isMarried, isFullTimeEmployee, credit);
				clientList.add(client);

				char quitProgram = 'N';

				System.out.println("If you want to close the program press Y, if not press N");
				quitProgram = sc.next().charAt(0);

				if (quitProgram == 'Y' || quitProgram == 'y') {
					break;
				}
			}

			int numClient = clientList.size();

			for (int i = 0; i < numClient; i++) {

				Client client = clientList.get(i);

				String creditType = "";

				if (client.getcredit() == 1) {
					creditType = "Cash loan";
				} else if (client.getcredit() == 2) {
					creditType = "House loan";
				} else if (client.getcredit() == 3) {
					creditType = "Car loan";
				}

				boolean isCreditApproved;

				if (client.getcredit() == 1 && client.getage() > 20 && client.getSalary() > 300) {
					isCreditApproved = true;
				} else if (client.getcredit() == 2 && client.getage() < 40 && client.getSalary() > 650
						&& client.isMarried() == true && client.isFullTimeEmployee() == true) {
					isCreditApproved = true;
				} else if (client.getcredit() == 3 && client.getage() > 20 && client.getSalary() > 250
						&& client.isFullTimeEmployee() == true) {
					isCreditApproved = true;
				} else {
					isCreditApproved = false;
				}

				int x = i + 1;
				System.out.println(
						x + ". Client applied for credit: " + creditType + "." + " Client's personal data are:");
				System.out.println("Name: " + client.getFirstName());
				System.out.println("Surname: " + client.getLastName());
				System.out.println("Salary: " + client.getSalary() + " EUR");
				System.out.println("Age: " + client.getage());
				System.out.println("Is married: " + client.isMarried());
				System.out.println("Is employed fulltime: " + client.isFullTimeEmployee());
				System.out.println("Approved: " + isCreditApproved);

				totalSalary += client.getSalary();

				if (isCreditApproved == true) {
					countCredit++;
				}

				if (client.isMarried() == true) {
					countMarried++;
				}

				if (client.isFullTimeEmployee() == true) {
					countEmployee++;
				}
			}

			System.out.println("Number of clients is " + numClient + ".");
			System.out.println("Average salary is " + totalSalary / numClient + ".");
			System.out.println("Number of approved credist is " + countCredit + ", and number of rejected credits is "
					+ (numClient - countCredit) + ".");
			System.out.println("The percentage of approved credits is " + (double) countCredit / numClient * 100
					+ "%, while percentage of rejected credits is "
					+ (double) (numClient - countCredit) / numClient * 100 + "%.");
			System.out.println("Number of married clients is " + countMarried + ", and number of single clients is "
					+ (numClient - countMarried) + ".");
			System.out.println("The percentage of married clients is " + (double) countMarried / numClient * 100
					+ "%, while percentage of single clients is "
					+ (double) (numClient - countMarried) / numClient * 100 + "%.");
			System.out.println("Number of clients with full time job is " + countEmployee
					+ ", and number of clients who don't have full time job is " + (numClient - countEmployee) + ".");
			System.out.println(
					"The percentage of  clients with full time job is " + (double) countEmployee / numClient * 100
							+ "%, while percentage of clients who don't have full time job is "
							+ (double) (numClient - countEmployee) / numClient * 100 + "%.");
		}
	}
}
