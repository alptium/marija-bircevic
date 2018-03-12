package elitesportsteamselector;

public class swimmer {

	private int registrationNumber;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String style;
	private int startingSpeed;
	private int speedTurns;

	public void employees(int registrationNumber, String firstName, String lastName, int age, String gender,
			String style, int startingSpeed, int speedTurns) {

		this.registrationNumber = registrationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.style = style;
		this.startingSpeed = startingSpeed;
		this.speedTurns = speedTurns;
	}

	public int getregistrationNumber() {
		return registrationNumber;
	}

	public void setregistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public String getgender() {
		return gender;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getstyle() {
		return style;
	}

	public void setstyle(String style) {
		this.style = style;
	}

	public int getstartingSpeed() {
		return startingSpeed;
	}

	public void setstartingSpeed(int startingSpeed) {
		this.startingSpeed = startingSpeed;
	}

	public int getspeedTurns() {
		return speedTurns;
	}

	public void setspeedTurns(int speedTurns) {
		this.speedTurns = speedTurns;
	}

}
