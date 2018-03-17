package bankloan;

public class Client {

	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private boolean isMarried;
	private boolean isFullTimeEmployee;
	private int credit;

	public Client(String firstName, String lastName, int age, double salary, boolean isMarried,
			boolean isFullTimeEmployee, int credit) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.isMarried = isMarried;
		this.isFullTimeEmployee = isFullTimeEmployee;
		this.credit = credit;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getage() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public boolean isFullTimeEmployee() {
		return isFullTimeEmployee;
	}

	public int getcredit() {
		return credit;
	}

	public int size() {

		return 0;
	}

}
