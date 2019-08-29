package johnBryce;

public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private String domain;
	private double grade;

	public Person(int id, String firstName, String lastName, String domain, double grade) {
		//Super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.domain = domain;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
}