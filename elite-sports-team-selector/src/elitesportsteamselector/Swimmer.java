package elitesportsteamselector;

public class Swimmer {

	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String style;
	private int startingSpeed;
	private int speedTurns;

	public Swimmer(String firstName, String lastName, int age, String gender, String style, int startingSpeed,
			int speedTurns) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.style = style;
		this.startingSpeed = startingSpeed;
		this.speedTurns = speedTurns;
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

	public String getgender() {
		return gender;
	}

	public String getstyle() {
		return style;
	}

	public int getstartingSpeed() {
		return startingSpeed;
	}

	public int getspeedTurns() {
		return speedTurns;
	}

}
