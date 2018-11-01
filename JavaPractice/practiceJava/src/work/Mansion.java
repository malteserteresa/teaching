package work;

import java.util.Scanner;

/**
 * Direct a person through the Downton Abbey Mansion, giving one line of
 * description as you enter each room. Focus on the Entrance Hall first,
 * deciding whether to go into the salon, dining room or north library
 * 
 * @author tcake
 *
 */
public class Mansion {

	static void positionDescription(String position) {
		switch (position) {
		case "Dining Room":
			System.out.println("You are now in the Dining room");
			break;
		case "Saloon":
			System.out.println("You are now in the Saloon");
			break;
		case "North Library":
			System.out.println("You are now in the North Library");
			break;
		case "Entrance Hall":
			System.out.println("You are now in the Entrance Hall");
			break;
		}
	}

	static String roomSuggestion(String position) {
		String nextRoom = null;
		switch (position) {
		case "Entrance Hall":
			System.out.println("Would you like to go to \n Saloon\n North Library\n Dining Room");
			Scanner scanner = new Scanner(System.in);
			nextRoom = scanner.nextLine();
			scanner.close();
		}
		return nextRoom;

	}

	public static void main(String[] args) {
		// get a starting position

		// write a method to tell the person where they are (switch)

		Scanner scanner = new Scanner(System.in);

		String startingPosition = "Entrance Hall";

		positionDescription(startingPosition);

		roomSuggestion(startingPosition);

		scanner.close();

	}

}
