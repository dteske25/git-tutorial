package demo;

public class Person {
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.email = "";
	}

	public Person(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	private String firstName;
	private String lastName;
	private String email;


	//TODO: Add getters
	//TODO: Add setters


	public String toString(){
		return lastName + ", " + firstName + "(" + emailAddress + ")";
	}
}
