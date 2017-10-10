package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	
	public static ArrayList<Person> people;
	
	/**
	 * This method takes a comma separated string in the format of 
	 * "firstName,lastName,emailAddress" and returns a new person object
	 * @param input String to be parsed
	 * @return new Person object with values
	 */
	public static Person ParseInput(String input) {
		String[] tokens = input.split(",");
		return new Person(tokens[0], tokens[1], tokens[2]);
	}
	
	/** 
	 * This method searches the static ArrayList, people, returning the
	 * first person to match by email, and null if there are no matches
	 * @param email
	 * @return the person with the email
	 */
	public static Person FindByEmail(String email) {
		//TODO
		return new Person();
	}

	public static void main(String[] args) {
		people = new ArrayList<Person>();
		//TODO: Add a welcome message
		String input = "";
		Scanner scan = new Scanner(System.in);
		Boolean shouldExit = false;
		while (!shouldExit) {
			//TODO: List the possible options 
			input = scan.nextLine();
			switch (input) {
			//TODO: Add a case to create a person: see "ParseInput" method above
			//TODO: Add a case to delete a person by email address
			//TODO: Add a case to print all people
			case "edit":
				//TODO: Ask the user who to edit, and store that person in a local variable
				Person tempPerson = new Person();
				while (!shouldExit) {
					System.out.println("What do you want to edit?");
					System.out.print("1. First Name\n2. Last Name\n3. Email\n4. Done\n");
					input = scan.nextLine();
					switch (input) {
					case "1":
						//TODO: Update first name based on user input
						break;
					case "2":
						//TODO: Update last name based on user input
						break;
					case "3":
						//TODO: Update email based on user input
						break;
					case "4":
						shouldExit = true;
						break;
					default: 
						break;
					}
				}
				shouldExit = false;
				break;
			case "exit":
				System.out.print("Exiting...");
				shouldExit = true;
				break;
			default:
				System.out.println("Input \"" + input + "\" not recognized!");
				break;
			}
		}
		scan.close();
		System.out.println("Goodbye!");
	}
}
