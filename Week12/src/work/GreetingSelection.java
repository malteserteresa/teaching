package work;

import java.util.ArrayList;
import java.util.Scanner;

public class GreetingSelection {

	public static void main(String[] args) {

		int userInput;

		ArrayList<String> greeting = new ArrayList<String>();
		greeting.add("0\t Hello");
		greeting.add("1\t Welcome");
		greeting.add("2\t Good day");
		System.out.println("Pick a greeting");
		for (int i = 0; i < greeting.size(); i++) {
			System.out.println(greeting.get(i));
		}
		Scanner scanner = new Scanner(System.in);
		userInput = scanner.nextInt();
		// fetch the right greetings from greeting
		System.out.println(greeting.get(userInput));

		// display it
	}

}
